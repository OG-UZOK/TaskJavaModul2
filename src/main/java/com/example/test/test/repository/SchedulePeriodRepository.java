package com.example.test.test.repository;

import com.example.test.test.model.entity.SchedulePeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulePeriodRepository extends JpaRepository<SchedulePeriod, String> {
    boolean existsByScheduleSlotId(String scheduleSlotId);
}
