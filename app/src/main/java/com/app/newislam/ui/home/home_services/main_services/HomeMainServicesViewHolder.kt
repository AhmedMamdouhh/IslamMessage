package com.app.newislam.ui.home.home_services.main_services

import android.content.Context
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.newislam.databinding.ItemHomeMainServicesBinding
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.gone
import com.app.newislam.manager.utilities.visible
import com.app.newislam.model.entities.home.services.HomeMainServices
import com.app.newislam.ui.home.HomeViewModel
import com.app.newislam.ui.home.home_services.single_service.HomeServiceAdapter
import org.koin.core.KoinComponent
import org.koin.core.inject


class HomeMainServicesViewHolder(
    private val binding: ItemHomeMainServicesBinding, private val context: Context,
    private val viewLifecycleOwner: LifecycleOwner
) : RecyclerView.ViewHolder(binding.root), KoinComponent {

    val manager: LinearLayoutManager? = null
    private val homeViewModel: HomeViewModel by inject()
    private lateinit var mainService : HomeMainServices

    fun bind(homeMainServices: HomeMainServices, position: Int) {
        binding.rvHomeServices.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        binding.clickListener = homeViewModel
        binding.homeMainServiceObject = homeMainServices

        mainService = homeMainServices
        mainService.subServicesList = arrayListOf(0,0,0)

        homeViewModel.servicePositionFactory(position)


        observeIslamicCentersPosition()
        observeEventsPosition()
        observeNewsPosition()
        observeSeeAllClicked()
    }


    private fun observeIslamicCentersPosition() {
        homeViewModel.observeIslamicCentersPosition.observe(viewLifecycleOwner, EventObserver {
            homeViewModel.islamicCentersViewModel.islamicCenters.observe(viewLifecycleOwner,
                EventObserver {
                    fillListWithData(it)
                    mainService.subServicesList[Constants.ISLAMIC_CENTER_ID] = it
                })
        })

    }

    private fun observeEventsPosition() {
        homeViewModel.observeEventsPosition.observe(viewLifecycleOwner, EventObserver {
            homeViewModel.islamicCentersViewModel.islamicCenters.observe(viewLifecycleOwner,
                EventObserver {
                    fillListWithData(it)
                    mainService.subServicesList[Constants.EVENTS_ID] = it

                })
        })
    }

    private fun observeNewsPosition() {
        homeViewModel.observeNewsPosition.observe(viewLifecycleOwner, EventObserver {
            homeViewModel.newsViewModel.observeNews.observe(viewLifecycleOwner,
                EventObserver {
                    fillListWithData(it)
                    mainService.subServicesList[Constants.NEWS_ID] = it
                })
        })

    }


    private fun observeSeeAllClicked() {
        homeViewModel.observeSeeAllClicked.observe(viewLifecycleOwner, EventObserver {
//            (context as com.app.newislam.ui.MainActivity).findNavController(R.id.hostFragment)
//                .navigate(R.id.action_homeFragment_to_centersFragment)


        })
    }


    private fun <T> fillListWithData(data: ArrayList<T>) {
        binding.layoutPlaceHolder.rlListPlaceHolderParent.gone()
        binding.llHomeMainServiceContainer.visible()
        binding.rvHomeServices.adapter = HomeServiceAdapter(data)
    }
}