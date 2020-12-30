//package com.app.newislam.ui.home.articles.details
//
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.core.view.ViewCompat
//import androidx.core.widget.NestedScrollView
//import androidx.navigation.fragment.navArgs
//import com.app.newislam.databinding.FragmentArticleDetailsBinding
//import com.app.newislam.databinding.FragmentCenterDetailsBinding
//import com.app.newislam.manager.base.BaseDialogFragment
//import com.app.newislam.manager.utilities.EventObserver
//import org.koin.androidx.viewmodel.ext.android.viewModel
//
//
//class ArticleDetailsFragment : BaseDialogFragment() {
//    val articleDetailsViewModel: ArticleDetailsViewModel by viewModel()
//    private val args: ArticleDetailsFragmentArgs by navArgs()
//
//
//    lateinit var binding: FragmentArticleDetailsBinding
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        binding = FragmentArticleDetailsBinding.inflate(inflater, container, false)
//        val root = binding.root
//
//        articleDetailsViewModel.articleId = args.articleId
//        articleDetailsViewModel.getArticleData()
//
//        observeCenterDetails()
//
//        observeBackClick()
//
//
//
//        binding.nsvCenterDetails.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
//            if (scrollY > oldScrollY) {
//                ViewCompat.setElevation(binding.centerToolbar, 30f)
//            }
//            if (scrollY < oldScrollY) {
//                ViewCompat.setElevation(binding.centerToolbar, 0f)
//            }
//        })
//
//        return root
//    }
//
//    private fun observeCenterDetails() {
//        articleDetailsViewModel.articleDetails.observe(this, EventObserver { data ->
//            binding.centerDetails = data
//        })
//    }
//
//    private fun observeBackClick() {
//        articleDetailsViewModel.observeBackClick.observe(this, EventObserver {
//            dismiss()
//        })
//    }
//}