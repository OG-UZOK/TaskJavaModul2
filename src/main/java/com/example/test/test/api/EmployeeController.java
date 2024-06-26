package com.example.test.test.api;

import com.example.test.test.model.entity.Employee;
import com.example.test.test.model.staff.CreateEmployee;
import com.example.test.test.service.impl.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServiceImpl staffServiceImpl;

    @PostMapping("/create")
    public ResponseEntity<?> createStaff(@RequestBody CreateEmployee employee) {
        System.out.println(employee.employeeName());
        //return ResponseEntity.ok(staffServiceImpl.createStaff(staff));
        Employee createdStaff = staffServiceImpl.createEmployee(employee);
        if (createdStaff != null) {
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create entity", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getStaffById(@PathVariable("id") String id) {
        return ResponseEntity.ok(staffServiceImpl.getEmployeeById(id));
    }

}