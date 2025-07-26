package com.example.EmployeeAPI.service;

import com.example.EmployeeAPI.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeByID(long id);

    List<EmployeeDto> getAllEmployee();

    EmployeeDto updateEmployee(long id, EmployeeDto employeeDto);

    String deleteEmployee(long id);

    List<EmployeeDto> sortedEmployee();
}
