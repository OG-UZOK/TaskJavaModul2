package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.Schedule;
import com.example.test.test.model.schedule.CreateSchedule;
import com.example.test.test.repository.ScheduleRepository;
import com.example.test.test.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository repository;

    public Schedule getSchedule(String id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Schedule with ID: " + id + " not found"));
    }

    public Schedule createSchedule(CreateSchedule schedule) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        Schedule newSchedule = new Schedule();
        newSchedule.setId(uuid);
        newSchedule.setScheduleName(schedule.scheduleName());
        return repository.save(newSchedule);
    }
}
