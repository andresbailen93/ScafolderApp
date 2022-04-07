package es.andres.bailen.scafolderApp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import es.andres.bailen.scafolderApp.data.coroutine.CoroutineContextProvider
import org.koin.android.ext.android.inject

abstract class BaseFragment: Fragment() {

    protected val coroutineContext: CoroutineContextProvider by inject()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewReady()
    }

    open fun viewReady() {
        setStaticContent()
        setListeners()
        setObservers()
        //removeAllNotifications()
    }

    abstract fun setStaticContent()
    abstract fun setListeners()
    abstract fun setObservers()

}