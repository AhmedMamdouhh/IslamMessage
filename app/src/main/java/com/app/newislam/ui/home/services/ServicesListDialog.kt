package com.app.newislam.ui.home.services

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.databinding.DialogServiceListBinding
import com.app.newislam.manager.connection.PaginationResource
import com.app.newislam.manager.utilities.Constants
import com.app.newislam.model.entities.home.HomeMainServices
import com.app.newislam.ui.home.home_services.single_service.HomeServiceAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class ServicesListDialog : Fragment() {

    private val serviceListViewModel: ServiceListViewModel by viewModel()
    private lateinit var binding: DialogServiceListBinding
    private lateinit var serviceList: PaginationResource<*>
    private var servicePosition: Int = 0
    private lateinit var adapter: HomeServiceAdapter<*>
    private var manager: LinearLayoutManager? = null
    private val isLastPage = false
    private var isLoading = false
    private lateinit var  args : Bundle



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogServiceListBinding.inflate(inflater, container, false)



        Log.e("324324", "onCreateView: " )

        binding.serviceListener = serviceListViewModel
        manager = LinearLayoutManager(requireContext())

        getBundleServiceList()
//        getMoreData()


        return binding.root
    }




//    private fun observeIslamicCentersData() {
//        serviceListViewModel.islamicCentersViewModel.observeIslamicCenters.observe(
//            viewLifecycleOwner,
//            EventObserver {
//                isLoading  = false
//                (adapter as HomeServiceAdapter<IslamicCenter>).addData(it)
//            })
//    }


    private fun getBundleServiceList() {
        args = requireArguments()

        binding.mainServiceObject = (args[Constants.BUNDLE_SERVICE_LIST] as HomeMainServices)
        binding.rvServiceList.layoutManager = manager
        servicePosition = (args[Constants.BUNDLE_SERVICE_ID] as Int)
        serviceList = (args[Constants.BUNDLE_SERVICE_LIST] as HomeMainServices).subServicesList

        adapter = HomeServiceAdapter(serviceList, true)
        serviceListViewModel.serviceFactory(servicePosition, serviceList)
        binding.rvServiceList.adapter = adapter
    }

//    private fun getMoreData() {
//        binding.rvServiceList.addOnScrollListener(object :
//            PaginationScrollListener(manager ?: LinearLayoutManager(requireContext())) {
//            override fun isLastPage(): Boolean {
//                return isLastPage
//            }
//
//            override fun isLoading(): Boolean {
//                return isLoading
//            }
//
//            override fun loadMoreItems() {
//                isLoading = true
//                Log.e("32432432432", "loadMoreItems: ")
//                observeIslamicCentersData()
//                serviceListViewModel.getMore(args.value.serviceId)
//            }
//        })
//    }
}