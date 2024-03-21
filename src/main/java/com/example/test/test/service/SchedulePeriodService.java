package com.example.test.test.service;

import com.example.test.test.model.entity.SchedulePeriod;
import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.schedulePeriod.CreateSchedulePeriod;

public interface SchedulePeriodService{
    public SchedulePeriod getSchedulePeriod(String id);
    public SchedulePeriod createSchedulePeriod(CreateSchedulePeriod schedulePeriod, Staff currentUser);
}
