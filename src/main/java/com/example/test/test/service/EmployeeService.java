package com.example.test.test.service;

import com.example.test.test.model.entity.Employee;
import com.example.test.test.model.staff.CreateEmployee;

public interface EmployeeService {
    public Employee getEmployeeById(String id);
    public Employee createEmployee(CreateEmployee staff);
}
