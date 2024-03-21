package com.example.test.test.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "schedule_template")
public class ScheduleTemplate {
    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(32)")
    private String id;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @PrePersist
    public void prePersist() {
        // Установка текущей даты и времени перед сохранением сущности
        this.creationDate = LocalDateTime.now();
    }

}
