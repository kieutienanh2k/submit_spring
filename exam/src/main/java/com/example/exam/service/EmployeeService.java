package com.example.exam.service;

import com.example.exam.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity employee);
    List<EmployeeEntity> getAllEmployee();
}
