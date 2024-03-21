package com.example.test.test.service.impl;

import com.example.test.test.exception.NotFoundException;
import com.example.test.test.model.entity.Staff;
import com.example.test.test.model.staff.CreateStaff;
import com.example.test.test.repository.StaffRepository;
import com.example.test.test.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StaffServiceImpl implements StaffService {
    private final StaffRepository repository;
    public Staff getStaffById(String id){
        return repository.findById(id)
                .orElseThrow(()-> new NotFoundException("Staff with ID: " + id + " not found"));
    }

    public Staff createStaff(CreateStaff staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        Staff newStaff = new Staff();
        newStaff.setId(uuid);
        newStaff.setEmployeeName(staff.employeeName());
        newStaff.setPosition(staff.position());
        newStaff.setStatus(staff.status());
        return repository.save(newStaff);
    }
}
