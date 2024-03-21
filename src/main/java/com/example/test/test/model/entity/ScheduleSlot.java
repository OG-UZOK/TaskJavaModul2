package com.example.test.test.model.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
@Table(name = "schedule_slot")
public class ScheduleSlot {
    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(32)")
    private String id;

    @ManyToOne
    @JoinColumn(name = "schedule_template_id", referencedColumnName = "id")
    private ScheduleTemplate scheduleTemplate;

    @Column(name = "begin_time")
    private LocalTime beginTime;

    @Column(name = "end_time")
    private LocalTime endTime;

}
