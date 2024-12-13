package com.employee.details.controller;

import com.employee.details.dto.request.EmployeeRequest;
import com.employee.details.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(path = "/employee")
    public String employeeDetails(@RequestBody EmployeeRequest employeeRequest) {
        employeeService.getEmployee(employeeRequest);
        return HttpStatus.ACCEPTED.toString();
    }
}
