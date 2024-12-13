package com.employee.details.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeResponse {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String yearlySalary;
    private String taxAmount;
    private String cessAmount;
    private String salary;
}