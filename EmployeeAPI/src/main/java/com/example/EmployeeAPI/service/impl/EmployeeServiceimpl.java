package com.example.EmployeeAPI.service.impl;

import com.example.EmployeeAPI.dto.EmployeeDto;
import com.example.EmployeeAPI.entity.Employee;
import com.example.EmployeeAPI.mapper.EmployeeMapper;
import com.example.EmployeeAPI.repository.EmployeeRepository;
import com.example.EmployeeAPI.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.example.EmployeeAPI.exception.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee= employeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return employeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeByID(long id){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException());
        return employeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployee(){
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        for(Employee emp: employeeRepository.findAll())
            employeeDtos.add(employeeMapper.mapToEmployeeDto(emp));
        return employeeDtos;
    }

    @Override
    public EmployeeDto updateEmployee(long id, EmployeeDto employeeDto){
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException());
            employee.setFirstName(employeeDto.getFirstName());
            employee.setLastName(employeeDto.getLastName());
            employee.setEmailID(employeeDto.getEmailID());
           return employeeMapper.mapToEmployeeDto(employeeRepository.save(employee));

    }

    @Override
    public String deleteEmployee(long id){
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException());
        employeeRepository.deleteById(id);
        return "Employee with id %s was successfully deleted".formatted(id);
    }

    @Override
    public List<EmployeeDto> sortedEmployee(){
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        for(Employee employee:employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName")))
            employeeDtos.add(employeeMapper.mapToEmployeeDto(employee));
        return employeeDtos;
    }
}
