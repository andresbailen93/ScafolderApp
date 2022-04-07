package es.andres.bailen.scafolderApp.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import es.andres.bailen.scafolderApp.data.database.model.DeviceContact

@Dao
interface DeviceContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg contacts: DeviceContact)
}