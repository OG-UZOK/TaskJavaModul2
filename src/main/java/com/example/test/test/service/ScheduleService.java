package com.example.test.test.service;

import com.example.test.test.model.entity.Schedule;
import com.example.test.test.model.schedule.CreateSchedule;

public interface ScheduleService {
    public Schedule getSchedule(String id);
    public Schedule createSchedule(CreateSchedule schedule);
}
