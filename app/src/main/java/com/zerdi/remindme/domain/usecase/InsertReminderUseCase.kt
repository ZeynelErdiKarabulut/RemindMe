package com.zerdi.remindme.domain.usecase

import android.util.Log
import com.zerdi.core.util.Constants
import com.zerdi.core.util.Resource
import com.zerdi.remindme.domain.model.Reminder
import com.zerdi.remindme.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class InsertReminderUseCase(private val reminderRepository: ReminderRepository) {

    operator fun invoke(reminder: Reminder): Flow<Resource<Long>> {
        return reminderRepository.insertReminder(reminder)
    }
}