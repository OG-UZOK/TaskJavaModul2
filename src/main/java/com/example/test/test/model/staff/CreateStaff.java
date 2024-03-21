package com.example.test.test.model.staff;

import com.example.test.test.model.enums.PositionType;
import com.example.test.test.model.enums.StatusType;
import lombok.Data;

public record CreateStaff(
        String employeeName,
        StatusType status,
        PositionType position
) {
}
