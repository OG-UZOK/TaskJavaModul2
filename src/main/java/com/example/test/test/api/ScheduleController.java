package com.example.test.test.api;

import com.example.test.test.model.entity.Schedule;
import com.example.test.test.model.schedule.CreateSchedule;
import com.example.test.test.service.impl.ScheduleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule")
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleServiceImpl scheduleServiceImpl;


    @PostMapping("/create")
    public ResponseEntity<?> createSchedule(@RequestBody CreateSchedule schedule) {
        Schedule createSchedule = scheduleServiceImpl.createSchedule(schedule);
        if (createSchedule != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
//    @ResponseBody
    public ResponseEntity<?> getSchedule(@PathVariable("id") String id) {
        return ResponseEntity.ok(scheduleServiceImpl.getSchedule(id));
    }

}