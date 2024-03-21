package com.example.test.test.service;

import com.example.test.test.model.entity.ScheduleTemplate;

public interface ScheduleTemplateService {
    public ScheduleTemplate getScheduleTemplate(String id);
    public ScheduleTemplate createScheduleTemplate(ScheduleTemplate scheduleTemplate);
}
