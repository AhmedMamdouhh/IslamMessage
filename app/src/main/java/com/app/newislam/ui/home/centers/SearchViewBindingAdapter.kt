package com.app.newislam.ui.home.centers

import android.annotation.TargetApi
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import androidx.appcompat.widget.SearchView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.databinding.adapters.SearchViewBindingAdapter


@BindingMethods(
    BindingMethod(
        type = SearchView::class,
        attribute = "android:onQueryTextFocusChange",
        method = "setOnQueryTextFocusChangeListener"
    ),
    BindingMethod(
        type = SearchView::class,
        attribute = "android:onSearchClick",
        method = "setOnSearchClickListener"
    ),
    BindingMethod(
        type = SearchView::class,
        attribute = "android:onClose",
        method = "setOnCloseListener"
    )
)
object SearchViewBindingAdapter {
    @BindingAdapter("android:onQueryTextChange")
    fun setListener(view: SearchView, listener: SearchViewBindingAdapter.OnQueryTextChange?) {
        setListener(view, null, listener)
    }

    @BindingAdapter("android:onQueryTextSubmit")
    fun setListener(view: SearchView, listener: SearchViewBindingAdapter.OnQueryTextSubmit?) {
        setListener(view, listener, null)
    }

    @BindingAdapter("android:onQueryTextSubmit", "android:onQueryTextChange")
    fun setListener(
        view: SearchView,
        submit: SearchViewBindingAdapter.OnQueryTextSubmit?,
        change: SearchViewBindingAdapter.OnQueryTextChange?
    ) {
        if (VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB) {
            if (submit == null && change == null) {
                view.setOnQueryTextListener(null)
            } else {
                view.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String?): Boolean {
                        return submit?.onQueryTextSubmit(query) ?: false
                    }

                    override fun onQueryTextChange(newText: String?): Boolean {
                        return change?.onQueryTextChange(newText) ?: false
                    }
                })
            }
        }
    }

    @BindingAdapter("android:onSuggestionClick")
    fun setListener(view: SearchView, listener: SearchViewBindingAdapter.OnSuggestionClick?) {
        setListener(view, null, listener)
    }

    @BindingAdapter("android:onSuggestionSelect")
    fun setListener(view: SearchView, listener: SearchViewBindingAdapter.OnSuggestionSelect?) {
        setListener(view, listener, null)
    }

    @BindingAdapter("android:onSuggestionSelect", "android:onSuggestionClick")
    fun setListener(
        view: SearchView,
        submit: SearchViewBindingAdapter.OnSuggestionSelect?,
        change: SearchViewBindingAdapter.OnSuggestionClick?
    ) {
        if (VERSION.SDK_INT >= VERSION_CODES.HONEYCOMB) {
            if (submit == null && change == null) {
                view.setOnSuggestionListener(null)
            } else {
                view.setOnSuggestionListener(object : SearchView.OnSuggestionListener {
                    override fun onSuggestionSelect(position: Int): Boolean {
                        return submit?.onSuggestionSelect(position) ?: false
                    }

                    override fun onSuggestionClick(position: Int): Boolean {
                        return change?.onSuggestionClick(position) ?: false
                    }
                })
            }
        }
    }


}