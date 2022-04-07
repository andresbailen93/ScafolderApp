package es.andres.bailen.scafolderApp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import es.andres.bailen.scafolderApp.data.database.dao.DeviceContactDao
import es.andres.bailen.scafolderApp.data.database.model.DeviceContact


@Database(entities = [DeviceContact::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactDao(): DeviceContactDao

}