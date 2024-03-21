package com.example.test.test.model.staff;

import com.example.test.test.model.enums.PositionType;
import com.example.test.test.model.enums.StatusType;

public record CreateEmployee(
        String employeeName,
        StatusType status,
        PositionType position
) {
}
