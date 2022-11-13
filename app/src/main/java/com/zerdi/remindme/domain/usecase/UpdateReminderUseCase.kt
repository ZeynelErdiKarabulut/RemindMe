package com.zerdi.remindme.domain.usecase

import com.zerdi.core.util.Resource
import com.zerdi.remindme.domain.model.Reminder
import com.zerdi.remindme.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class UpdateReminderUseCase(private val reminderRepository: ReminderRepository) {

    operator fun invoke(reminder: Reminder): Flow<Resource<Unit>> {
        return reminderRepository.updateReminder(reminder)
    }
}