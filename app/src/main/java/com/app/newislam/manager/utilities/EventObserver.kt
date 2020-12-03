package com.app.newislam.manager.utilities

import androidx.lifecycle.Observer
import org.jetbrains.annotations.NotNull


class EventObserver<T>(private val observe: (T) -> Unit) : Observer<Event<T>> {
    override fun onChanged(event: Event<T>?) {
        event?.getContentIfNotHandled()?.let { value ->
            observe(value)
        }
    }
}