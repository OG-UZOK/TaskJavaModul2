package com.example.test.test.api;

import com.example.test.test.model.entity.ScheduleSlot;
import com.example.test.test.model.scheduleSlot.CreateScheduleSlot;
import com.example.test.test.service.impl.ScheduleSlotServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule/slot")
@RequiredArgsConstructor
public class ScheduleSlotController {
    private final ScheduleSlotServiceImpl scheduleSlotServiceImpl;


    @PostMapping("/create")
    public ResponseEntity<?> createScheduleSlot(@RequestBody CreateScheduleSlot scheduleSlot) {

        ScheduleSlot createScheduleSlot = scheduleSlotServiceImpl.createScheduleSlot(scheduleSlot);
        if (createScheduleSlot != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
//    @ResponseBody
    public ResponseEntity<?> getScheduleSlot(@PathVariable("id") String id) {
        return ResponseEntity.ok(scheduleSlotServiceImpl.getScheduleSlot(id));
    }

    // Удаление сотрудника по его идентификатору
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStaff(@PathVariable("id") String id) {
//        staffServiceImpl.deleteStaffById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}