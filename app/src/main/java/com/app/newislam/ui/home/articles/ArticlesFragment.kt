//package com.app.newislam.ui.home.articles
//
//import android.icu.util.TimeUnit
//import android.os.Bundle
//import android.text.Editable
//import android.text.TextWatcher
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.appcompat.widget.SearchView
//import androidx.core.widget.doOnTextChanged
//import androidx.navigation.fragment.findNavController
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.app.newislam.databinding.FragmentArticlesBinding
//import com.app.newislam.databinding.FragmentIslamicCentersBinding
//import com.app.newislam.manager.base.BaseDialogFragment
//import com.app.newislam.manager.utilities.EventObserver
//import com.app.newislam.manager.utilities.PaginationScrollListener
//import com.app.newislam.model.requests.home.Articles
//import com.app.newislam.ui.home.centers.CentersFragmentDirections
//import io.reactivex.Observable
//import io.reactivex.Observer
//import io.reactivex.android.schedulers.AndroidSchedulers
//import io.reactivex.disposables.Disposable
//import io.reactivex.internal.util.NotificationLite.disposable
//import io.reactivex.schedulers.Schedulers
//import kotlinx.android.synthetic.main.fragment_islamic_centers.*
//import org.koin.androidx.viewmodel.ext.android.viewModel
//
//
//class ArticlesFragment : BaseDialogFragment() ,ArticlesAdapter.OnArticleClicked{
//
//    val articlesViewModel: ArticlesViewModel by viewModel()
//    var articlesAdapter: ArticlesAdapter? = null
//    var manager: LinearLayoutManager? = null
//
//    lateinit var binding: FragmentArticlesBinding
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentArticlesBinding.inflate(inflater, container, false)
//        val root = binding.root
//        manager = LinearLayoutManager(requireContext())
//        articlesViewModel.islamicArticles.observe(this, EventObserver { event ->
//            binding.rvArticles.apply {
//                articlesAdapter = ArticlesAdapter(this@ArticlesFragment)
//                articlesAdapter?.submitList(event)
//                articlesAdapter?.mArticlesList = event
//                adapter = articlesAdapter
//                itemAnimator = null
//                layoutManager = manager
//                setHasFixedSize(true)
//            }
//        })
//
//        articlesViewModel.moreIslamicArticles.observe(this, EventObserver { event ->
//            if (event.isNotEmpty()) articlesAdapter?.submitList(event)
//            articlesAdapter?.notifyItemInserted(event.lastIndex)
//
//        })
//
//        searchObserver()
//        getMoreData()
//
//
//        return root
//    }
//
//    private fun searchObserver() {
//        val observable = Observable
//            .create<String> { emitter ->
//                sv_centers.doOnTextChanged { s, start, before, count ->
//                    if (!emitter.isDisposed) emitter.onNext(s.toString().toLowerCase())
//                }
//            }
//            .debounce(500, java.util.concurrent.TimeUnit.MILLISECONDS)
//            .subscribeOn(AndroidSchedulers.mainThread())
//            .observeOn(Schedulers.io())
//            .observeOn(AndroidSchedulers.mainThread())
//
//        disposable(observable.subscribe({ s ->
//            articlesAdapter?.filter?.filter(s)
//        }, {}))
//    }
//
//    fun getMoreData() {
//        var isLastPage: Boolean = false
//        var isLoading: Boolean = false
//        if (!binding.svCenters.hasFocus())
//            binding.rvArticles.addOnScrollListener(object :
//                PaginationScrollListener(manager ?: LinearLayoutManager(requireContext())) {
//                override fun isLastPage(): Boolean {
//                    return isLastPage
//                }
//
//                override fun isLoading(): Boolean {
//                    return isLoading
//                }
//
//                override fun loadMoreItems() {
//                    isLoading = true
//                    //you have to call loadmore items to get more data
//                    articlesViewModel.loadMoreItems()
//                    isLoading = false
//                }
//            })
//    }
//
//    override fun onArticleClicked(article: Articles) {
//        if (article != null) {
//            val action =
//                ArticlesFragmentDirections.actionArticlesFragmentToArticleDetailsFragment(article.id)
//            findNavController().navigate(action)
//        }
//    }
//}