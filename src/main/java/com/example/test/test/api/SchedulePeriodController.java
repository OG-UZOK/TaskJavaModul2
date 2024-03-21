package com.example.test.test.api;

import com.example.test.test.model.entity.SchedulePeriod;
import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.schedulePeriod.CreateSchedulePeriod;
import com.example.test.test.service.impl.SchedulePeriodServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule/period")
@RequiredArgsConstructor
public class SchedulePeriodController {
    private final SchedulePeriodServiceImpl schedulePeriodServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<?> createSchedulePeriod(@RequestHeader("x-current-user") Staff currentUser, @RequestBody CreateSchedulePeriod schedulePeriod) {
        SchedulePeriod createSchedulePeriod = schedulePeriodServiceImpl.createSchedulePeriod(schedulePeriod, currentUser);
        if (createSchedulePeriod != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSchedule(@PathVariable("id") String id) {
        return ResponseEntity.ok(schedulePeriodServiceImpl.getSchedulePeriod(id));
    }

}