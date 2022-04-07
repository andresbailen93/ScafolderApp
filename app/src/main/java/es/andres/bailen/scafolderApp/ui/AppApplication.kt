package es.andres.bailen.scafolderApp.ui

import android.app.Application
import es.andres.bailen.scafolderApp.di.appModule
import es.andres.bailen.scafolderApp.di.databaseModule
import es.andres.bailen.scafolderApp.di.presentationModule
import es.andres.bailen.scafolderApp.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(applicationContext)
            modules(appModule + databaseModule + repositoryModule + presentationModule)
        }
    }

}