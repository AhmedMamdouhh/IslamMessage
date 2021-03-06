package com.app.newislam.ui.home.home_services.main_services

import android.content.Context
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.R
import com.app.newislam.databinding.ItemHomeMainServicesBinding
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.gone
import com.app.newislam.manager.utilities.visible
import com.app.newislam.model.entities.home.HomeMainServices
import com.app.newislam.ui.home.HomeFragmentDirections
import com.app.newislam.ui.home.HomeViewModel
import com.app.newislam.ui.home.home_services.single_service.HomeServiceAdapter
import org.koin.core.KoinComponent
import kotlin.collections.ArrayList


class HomeMainServicesViewHolder(
    val binding: ItemHomeMainServicesBinding, private val context: Context,
    private val viewLifecycleOwner: LifecycleOwner,
    private val homeViewModel: HomeViewModel,
    private val homeMainServicesList: ArrayList<HomeMainServices>
) : RecyclerView.ViewHolder(binding.root), KoinComponent {

    private lateinit var mainService: HomeMainServices


    fun bind(homeMainServices: HomeMainServices) {

        binding.clickListener = homeViewModel
        binding.homeMainServiceObject = homeMainServices

        mainService = homeMainServices


        getServicesData()
    }

    private fun getServicesData() {
        when (adapterPosition) {
            Constants.ISLAMIC_CENTER_ID -> {
                homeViewModel.islamicCentersViewModel.observeIslamicCenters.observe(
                    viewLifecycleOwner,
                    EventObserver {
                        homeMainServicesList[Constants.ISLAMIC_CENTER_ID].subServicesList = it
                        fillListWithData(it)
                    })
            }
            Constants.EVENTS_ID -> {
                homeViewModel.eventsViewModel.observeEvents.observe(
                    viewLifecycleOwner,
                    EventObserver {
                        homeMainServicesList[Constants.EVENTS_ID].subServicesList = it
                        fillListWithData(it)
                    })
            }
            Constants.NEWS_ID -> {
                homeViewModel.newsViewModel.observeNews.observe(viewLifecycleOwner,
                    EventObserver {
                        homeMainServicesList[Constants.NEWS_ID].subServicesList = it
                        fillListWithData(it)
                    })
            }
        }

    }


    fun observeSeeAllClicked() {

        val action = HomeFragmentDirections.actionHomeFragmentToServiceContainer(mainService,adapterPosition)
        (context as com.app.newislam.ui.MainActivity).findNavController(R.id.hostFragment)
            .navigate(action)

//        val action = HomeFragmentDirections.act()
//        (context as com.app.newislam.ui.MainActivity).findNavController(R.id.hostFragment)
//            .navigate(action.actionId,ServicesListDialogArgs(homeMainServicesList[adapterPosition], adapterPosition).toBundle())
    }


    private fun <T> fillListWithData(data: T) {
        binding.rvHomeServices.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.layoutPlaceHolder.rlListPlaceHolderParent.gone()
        binding.llHomeMainServiceContainer.visible()
        binding.rvHomeServices.adapter = HomeServiceAdapter(data as PaginationResource<*>, false)
    }

}
