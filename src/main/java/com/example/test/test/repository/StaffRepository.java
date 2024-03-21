package com.example.test.test.repository;

import com.example.test.test.model.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
