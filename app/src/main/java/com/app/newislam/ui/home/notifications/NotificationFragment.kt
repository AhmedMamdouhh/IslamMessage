package com.app.newislam.ui.home.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.newislam.R
import com.app.newislam.databinding.FragmentNotificationsBinding
import com.app.newislam.manager.base.BaseFragment
import com.app.newislam.manager.utilities.EventObserver
import com.app.newislam.manager.utilities.addSwipeItemAction
import com.app.newislam.manager.utilities.bottomNavigationVisibility
import com.app.newislam.manager.utilities.toolBarVisibility
import com.app.newislam.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class NotificationFragment : BaseFragment() {

    lateinit var binding: FragmentNotificationsBinding
    val viewModel: NotificationViewModel by viewModel()
    var notificationAdapter: NotificationAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        if (savedInstanceState == null) {
            binding = FragmentNotificationsBinding.inflate(layoutInflater)
            viewModel.getNotifications()
            (activity as MainActivity).toolBarVisibility(true)
            (activity as MainActivity).bottomNavigationVisibility(true)
            viewModel.notifications.observe(viewLifecycleOwner, EventObserver {
                binding.rvNotifications.apply {
                    layoutManager = LinearLayoutManager(requireContext())
                    notificationAdapter = NotificationAdapter(it, viewLifecycleOwner)
                    adapter = notificationAdapter
                    addItemDecoration(DividerItemDecoration(
                        context,
                        LinearLayoutManager.HORIZONTAL
                    ))
                }
            })

            addSwipeAction()
        }

        return binding.root

    }

    private fun addSwipeAction() {
        var removedItemIndex: Int
        binding.rvNotifications.addSwipeItemAction(
            ContextCompat.getDrawable(requireContext(),
                R.drawable.ic_baseline_delete_forever_24)!!,
            ContextCompat.getColor(requireContext(), R.color.colorRed)) {
            removedItemIndex = it.adapterPosition
            notificationAdapter!!.remove(removedItemIndex)
        }
    }
}