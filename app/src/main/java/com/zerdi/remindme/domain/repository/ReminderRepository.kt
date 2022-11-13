package com.zerdi.remindme.domain.repository

import com.zerdi.remindme.domain.model.Reminder
import com.zerdi.core.util.Resource
import kotlinx.coroutines.flow.Flow

interface ReminderRepository {

    fun insertReminder(reminder: Reminder): Flow<Resource<Long>>

    fun deleteReminder(reminder: Reminder): Flow<Resource<Unit>>

    fun getReminderById(reminderId: Long): Flow<Resource<Reminder>>

    fun updateReminder(reminder: Reminder): Flow<Resource<Unit>>

    fun getReminders(): Flow<Resource<List<Reminder>>>
}