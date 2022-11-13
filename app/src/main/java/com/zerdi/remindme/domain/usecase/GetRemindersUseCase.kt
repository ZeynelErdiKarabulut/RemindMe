package com.zerdi.remindme.domain.usecase

import com.zerdi.core.util.Resource
import com.zerdi.remindme.domain.model.Reminder
import com.zerdi.remindme.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class GetRemindersUseCase(private val reminderRepository: ReminderRepository) {

    operator fun invoke(): Flow<Resource<List<Reminder>>> {
        return reminderRepository.getReminders()
    }
}