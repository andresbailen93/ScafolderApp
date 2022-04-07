package es.andres.bailen.scafolderApp.di

import androidx.room.Room
import androidx.work.WorkManager
import es.andres.bailen.scafolderApp.data.coroutine.CoroutineContextProvider
import es.andres.bailen.scafolderApp.data.database.AppDatabase
import es.andres.bailen.scafolderApp.data.repository.ContactsRepo
import es.andres.bailen.scafolderApp.ui.viewModel.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val databaseModule: Module = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            "application_database"
        ).fallbackToDestructiveMigration()
            .build()
    }
    single { get<AppDatabase>().contactDao() }
}

val appModule: Module = module {
    single { CoroutineContextProvider() }
    single { WorkManager.getInstance(androidContext()) }
}

val repositoryModule: Module = module {
    single<ContactsRepo> { ContactsRepo(get()) }
}

val presentationModule: Module = module {
    viewModel { MainViewModel(get()) }
}