package com.app.newislam.model.requests.home.centers

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.app.newislam.R
import com.bumptech.glide.Glide
import com.google.gson.annotations.SerializedName


data class IslamicCentersResponse(
    @SerializedName("pageIndex") val pageIndex: Int,
    @SerializedName("totalPages") val totalPages: Int,
    @SerializedName("items") val items: List<Centers>,
    @SerializedName("hasPreviousPage") val hasPreviousPage: Boolean,
    @SerializedName("hasNextPage") val hasNextPage: Boolean
)

data class Centers(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("country") val country: String=" ",
    @SerializedName("city") val city: String=" ",
    @SerializedName("image") val image: String=" "
)

@BindingAdapter("image", "placeholder")
fun ImageView.setImage( url: String?, placeHolder: Drawable) {
    if (!url.isNullOrEmpty())
        Glide.with(this.context).load(url).centerCrop().placeholder(R.drawable.ic_home)
            .into(this)
    else this.setImageDrawable(placeHolder)
}

