package com.app.newislam.di

import androidx.multidex.BuildConfig.DEBUG
import com.app.newislam.connection.*
import com.google.gson.Gson
import com.readystatesoftware.chuck.BuildConfig
import com.readystatesoftware.chuck.ChuckInterceptor
import io.reactivex.disposables.CompositeDisposable
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val dataModule = module {

    single {
        AppSchedulerProvider()
    }

    factory {
        CompositeDisposable()
    }


    // Prefs manager injection
    single {
        PreferencesManagerRepository(get(), get())
    }
    single {
        Gson()
    }

    //ApiManager injection
    single {
        ApiManagerRepository()
    }

    factory {
//        ApiHeader(
//                deviceToken = (get() as PreferencesManagerRepository).getDeviceToken() ?: "",
//                deviceId = (get() as PreferencesManagerRepository).getDeviceId() ?: "",
//                countryId = (get() as PreferencesManagerRepository).getAppCountry().id,
//                languageId = (get() as PreferencesManagerRepository).getPreferredLanguage()?.id?:"1",
//                language = (get() as PreferencesManagerRepository).getPreferredLanguage()?.identifier?:"en"
//        )
    }


    single {
        val client = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            client.addInterceptor(
                    HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            client.addInterceptor(ChuckInterceptor(get()))
        }



        client.addInterceptor(Interceptor { chain ->
            val original = chain.request()
            val apiHeader = (get() as ApiHeader)
            val request =
                    original.newBuilder()
                            .header("Content-Type", "application/json")
                            .header("Accept", "application/json")
                            .header("device-name", "android")
                            .header("device-type", "android")
                            .header("language-id", apiHeader.languageId)
                            .header("language", apiHeader.language)
                            .header("country-id", apiHeader.countryId.toString())
                            .header("device-token", apiHeader.deviceToken)
                            .header("device-uuid", if (apiHeader.deviceId.isNullOrEmpty()) "92445BAE-8B44-4AF5-8BFC-9316D8F23DD8" else apiHeader.deviceId)
                            .header("x-api-key"," Constants.API_KEY")
                            .method(original.method, original.body).build()

            return@Interceptor chain.proceed(request)
        })

        client.connectTimeout(if (DEBUG) 30 else 10, TimeUnit.SECONDS)
                .readTimeout(if (DEBUG) 30 else 10, TimeUnit.SECONDS)
                .writeTimeout(if (DEBUG) 30 else 10, TimeUnit.SECONDS).build()
        val retrofit = Retrofit.Builder().baseUrl(ApiEndPoints.BASE_URL).client(client.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()

        retrofit.create(Api::class.java)
    }
}

