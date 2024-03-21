package com.example.test.test.api;

import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.staff.CreateStaff;
import com.example.test.test.service.impl.StaffServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/staff")
@RequiredArgsConstructor
public class StaffController {
    private final StaffServiceImpl staffServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<?> createStaff(@RequestBody CreateStaff staff) {
        System.out.println(staff.employeeName());
        //return ResponseEntity.ok(staffServiceImpl.createStaff(staff));
        Staff createdStaff = staffServiceImpl.createStaff(staff);
        if (createdStaff != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getStaffById(@PathVariable("id") String id) {
        return ResponseEntity.ok(staffServiceImpl.getStaffById(id));
    }

}