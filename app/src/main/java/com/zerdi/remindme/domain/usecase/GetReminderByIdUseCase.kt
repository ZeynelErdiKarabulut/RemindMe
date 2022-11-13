package com.zerdi.remindme.domain.usecase

import com.zerdi.core.util.Resource
import com.zerdi.remindme.domain.model.Reminder
import com.zerdi.remindme.domain.repository.ReminderRepository
import kotlinx.coroutines.flow.Flow

class GetReminderByIdUseCase(private val reminderRepository: ReminderRepository) {

    operator fun invoke(reminderId: Long): Flow<Resource<Reminder>> {
        return reminderRepository.getReminderById(reminderId = reminderId)
    }
}