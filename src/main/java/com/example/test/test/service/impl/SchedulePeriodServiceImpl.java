package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.SchedulePeriod;
import com.example.test.test.model.entity.ScheduleSlot;
import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.schedulePeriod.CreateSchedulePeriod;
import com.example.test.test.repository.SchedulePeriodRepository;
import com.example.test.test.service.SchedulePeriodService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SchedulePeriodServiceImpl implements SchedulePeriodService {
    private final SchedulePeriodRepository repository;
    public SchedulePeriod getSchedulePeriod(String id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Schedule Period with ID: " + id + " not found"));
    }

    public SchedulePeriod createSchedulePeriod(CreateSchedulePeriod schedulePeriod, Staff currentUser) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        SchedulePeriod newSchedulePeriod = new SchedulePeriod();
        newSchedulePeriod.setId(uuid);
        newSchedulePeriod.setScheduleId(schedulePeriod.scheduleId());
        newSchedulePeriod.setScheduleSlot(schedulePeriod.scheduleSlotId());
        newSchedulePeriod.setSlotType(schedulePeriod.slotType());
        newSchedulePeriod.setAdministratorId(currentUser);
        newSchedulePeriod.setExecutorId(schedulePeriod.executorId());

        return repository.save(newSchedulePeriod);
    }


}
