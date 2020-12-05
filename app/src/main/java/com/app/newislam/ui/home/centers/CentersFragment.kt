package com.app.newislam.ui.home.centers

import android.icu.util.TimeUnit
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.databinding.FragmentIslamicCentersBinding
import com.app.newislam.manager.base.BaseDialogFragment
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.PaginationScrollListener
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.internal.util.NotificationLite.disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_islamic_centers.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class CentersFragment : BaseDialogFragment() {

    val centersViewModel: CentersViewModel by viewModel()
    var centersAdapter: CentersAdapter? = null
    var manager: LinearLayoutManager? = null

    lateinit var binding: FragmentIslamicCentersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIslamicCentersBinding.inflate(inflater, container, false)
        val root = binding.root
        manager = LinearLayoutManager(requireContext())
        centersViewModel.islamicCenters.observe(this, EventObserver { event ->
            binding.rvCenters.apply {
                centersAdapter = CentersAdapter()
                centersAdapter?.submitList(event)
                centersAdapter?.mCentersList = event
                adapter = centersAdapter
                itemAnimator = null
                layoutManager = manager
                setHasFixedSize(true)
            }
        })

        centersViewModel.moreIslamicCenters.observe(this, EventObserver { event ->
            if (event.isNotEmpty()) centersAdapter?.submitList(event)
            centersAdapter?.notifyItemInserted(event.lastIndex)

        })

        searchObserver()
        getMoreData()


        return root
    }

    private fun searchObserver() {
        val observable = Observable
            .create<String> { emitter ->
                sv_centers.doOnTextChanged { s, start, before, count ->
                    if (!emitter.isDisposed) emitter.onNext(s.toString())
                }
            }
            .debounce(500, java.util.concurrent.TimeUnit.MILLISECONDS)
            .subscribeOn(AndroidSchedulers.mainThread())
            .observeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())

        disposable(observable.subscribe({ s ->
            centersAdapter?.filter?.filter(s)
        }, {}))
    }

    fun getMoreData() {
        var isLastPage: Boolean = false
        var isLoading: Boolean = false

        binding.rvCenters.addOnScrollListener(object :
            PaginationScrollListener(manager ?: LinearLayoutManager(requireContext())) {
            override fun isLastPage(): Boolean {
                return isLastPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

            override fun loadMoreItems() {
                isLoading = true
                //you have to call loadmore items to get more data
                centersViewModel.loadMoreItems()
                isLoading = false
            }
        })
    }
}