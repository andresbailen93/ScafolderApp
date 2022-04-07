package es.andres.bailen.skeleton.data.database.model

import androidx.room.Entity
import androidx.room.Index

@Entity(
    indices = [
        Index("escapedName"),
        Index("msisdn")
    ],
    primaryKeys = ["contactId"]
)
data class DeviceContact (
    val contactId: String,
    val name: String,
    val alternativeName: String?,
    val escapedName: String?,
    val msisdn: String,
    val imagePath: String? = null,
    var contactVersion: Int = 0
)