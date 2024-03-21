package com.example.test.test.model.schedulePeriod;

import com.example.test.test.model.entity.Schedule;
import com.example.test.test.model.entity.ScheduleSlot;
import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.enums.SlotType;

public record CreateSchedulePeriod(
        ScheduleSlot scheduleSlotId,
        Schedule scheduleId,
        SlotType slotType,
        Staff administratorId,
        Staff executorId
) {

}
