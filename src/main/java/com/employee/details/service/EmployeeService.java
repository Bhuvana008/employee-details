package com.employee.details.service;

import com.employee.details.dto.request.EmployeeRequest;
import com.employee.details.dto.response.EmployeeResponse;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public EmployeeResponse getEmployee(EmployeeRequest employeeRequest) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        if(employeeRequest.getSalary() <= 2500000) {
            employeeResponse.setTaxAmount(String.valueOf(employeeRequest.getSalary()));
        }
        return employeeResponse;
    }
}
