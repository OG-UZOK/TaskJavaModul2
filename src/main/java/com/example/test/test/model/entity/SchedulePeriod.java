package com.example.test.test.model.entity;

import com.example.test.test.model.enums.SlotType;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "schedule_period")
public class SchedulePeriod {
    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(32)")
    private String id;

    @ManyToOne
    @JoinColumn(name = "slot_id", referencedColumnName = "id")
    private ScheduleSlot scheduleSlot;

    @ManyToOne
    @JoinColumn(name = "schedule_id", referencedColumnName = "id")
    private Schedule scheduleId;

    @Enumerated(EnumType.STRING)
    @Column(name = "slot_type",nullable = false, columnDefinition = "VARCHAR(20)")
    private SlotType slotType;

    @OneToOne
    @JoinColumn(name = "administrator_id", referencedColumnName = "id")
    private Staff administratorId;

    @OneToOne
    @JoinColumn(name = "executor_id",nullable = true, referencedColumnName = "id")
    private Staff executorId;


}
