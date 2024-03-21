package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.ScheduleTemplate;
import com.example.test.test.repository.ScheduleTemplateRepository;
import com.example.test.test.service.ScheduleTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScheduleTemplateServiceImpl implements ScheduleTemplateService {
    private final ScheduleTemplateRepository repository;
    public ScheduleTemplate getScheduleTemplate(String id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Schedule Template with ID: " + id + " not found"));
    }

    public ScheduleTemplate createScheduleTemplate(ScheduleTemplate scheduleTemplate) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        scheduleTemplate.setId(uuid);
        System.out.println(uuid);
        return repository.save(scheduleTemplate);
    }

}
