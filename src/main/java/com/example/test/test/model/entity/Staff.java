package com.example.test.test.model.entity;

import com.example.test.test.model.enums.PositionType;
import com.example.test.test.model.enums.StatusType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "staff")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Staff {
    @Id
    @Column(name = "id", updatable = false, nullable = false, columnDefinition = "VARCHAR(32)")
    private String id;

    @Column(name = "employee_name",nullable = false, columnDefinition = "VARCHAR(255)")
    private String employeeName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false, columnDefinition = "VARCHAR(20)")
    private StatusType status;

    @Enumerated(EnumType.STRING)
    @Column(name = "position",nullable = false, columnDefinition = "VARCHAR(20)")
    private PositionType position;


}