package com.example.test.test.api;

import com.example.test.test.model.entity.ScheduleTemplate;
import com.example.test.test.service.impl.ScheduleTemplateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule/template")
@RequiredArgsConstructor
public class ScheduleTemplateController {
    private final ScheduleTemplateServiceImpl scheduleTemplateServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<?> createScheduleTemplate(@RequestBody ScheduleTemplate scheduleTemplate) {
        ScheduleTemplate createdScheduleTemplate = scheduleTemplateServiceImpl.createScheduleTemplate(scheduleTemplate);
        if (createdScheduleTemplate != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getScheduleTemplate(@PathVariable("id") String id) {
        return ResponseEntity.ok(scheduleTemplateServiceImpl.getScheduleTemplate(id));
    }

    // Удаление сотрудника по его идентификатору
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteStaff(@PathVariable("id") String id) {
//        staffServiceImpl.deleteStaffById(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}