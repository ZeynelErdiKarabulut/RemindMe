package com.zerdi.remindme.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.zerdi.remindme.data.local.dao.ReminderDao
import com.zerdi.remindme.data.local.entity.ReminderEntity
import com.zerdi.remindme.data.local.converter.InstantConverter

@Database(entities = [ReminderEntity::class], version = 1, exportSchema = false)
@TypeConverters(value = [InstantConverter::class])
abstract class ReminderDatabase: RoomDatabase() {

    abstract val reminderDao: ReminderDao
}