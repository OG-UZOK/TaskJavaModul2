package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.Employee;
import com.example.test.test.model.staff.CreateEmployee;
import com.example.test.test.repository.EmployeeRepository;
import com.example.test.test.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    public Employee getEmployeeById(String id){
        return repository.findById(id)
                .orElseThrow(()-> new NotFoundException("Employee with ID: " + id + " not found"));
    }

    public Employee createEmployee(CreateEmployee staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        Employee newStaff = new Employee();
        newStaff.setId(uuid);
        newStaff.setEmployeeName(staff.employeeName());
        newStaff.setPosition(staff.position());
        return repository.save(newStaff);
    }
}
