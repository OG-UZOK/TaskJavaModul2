package com.example.test.test.service;

import com.example.test.test.model.entity.ScheduleSlot;
import com.example.test.test.model.scheduleSlot.CreateScheduleSlot;

public interface ScheduleSlotService {
    public ScheduleSlot getScheduleSlot(String id);
    public ScheduleSlot createScheduleSlot(CreateScheduleSlot scheduleSlot);
}
