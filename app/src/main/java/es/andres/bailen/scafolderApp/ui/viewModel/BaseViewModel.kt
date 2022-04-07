package es.andres.bailen.scafolderApp.ui.viewModel

import androidx.lifecycle.ViewModel
import es.andres.bailen.scafolderApp.data.coroutine.CoroutineContextProvider
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

abstract class BaseViewModel: KoinComponent, ViewModel() {
    protected val coroutineContext: CoroutineContextProvider by inject()
}