package com.example.test.test.service;

import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.staff.CreateStaff;

public interface StaffService {
    public Staff getStaffById(String id);
    public Staff createStaff(CreateStaff staff);
}
