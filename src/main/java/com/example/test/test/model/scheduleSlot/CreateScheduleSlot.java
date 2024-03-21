package com.example.test.test.model.scheduleSlot;

import java.time.LocalTime;

public record CreateScheduleSlot(
        String scheduleTemplateId,
        LocalTime beginTime,
        LocalTime endTime
) {
}
