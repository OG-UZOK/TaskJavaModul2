package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.ScheduleSlot;
import com.example.test.test.model.scheduleSlot.CreateScheduleSlot;
import com.example.test.test.repository.ScheduleSlotRepository;
import com.example.test.test.repository.ScheduleTemplateRepository;
import com.example.test.test.service.ScheduleSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ScheduleSlotServiceImpl implements ScheduleSlotService {
    private final ScheduleSlotRepository repositoryScheduleSlot;
    private final ScheduleTemplateRepository repositoryScheduleTemplate;
    public ScheduleSlot getScheduleSlot(String id){
        return repositoryScheduleSlot.findById(id).orElseThrow(() -> new NotFoundException("Schedule Slot with ID: " + id + " not found"));
    }



    public ScheduleSlot createScheduleSlot(CreateScheduleSlot scheduleSlot) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        ScheduleSlot newScheduleSlot = new ScheduleSlot();
        newScheduleSlot.setId(uuid);
        newScheduleSlot.setScheduleTemplate(repositoryScheduleTemplate.findById(scheduleSlot.scheduleTemplateId()).orElseThrow(() -> new NotFoundException("Schedule slot with ID = " +
                repositoryScheduleTemplate.findById(scheduleSlot.scheduleTemplateId()))));
        return repositoryScheduleSlot.save(newScheduleSlot);
    }
}
