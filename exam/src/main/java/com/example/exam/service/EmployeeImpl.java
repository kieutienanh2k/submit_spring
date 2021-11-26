package com.example.exam.service;

import com.example.exam.entity.EmployeeEntity;
import com.example.exam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        EmployeeEntity employeeEntity = employeeRepo.save(employee);
        return employeeEntity;
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }

//    @Override
//    public List<EmployeeEntity> getProductByName(String name) {
//        return employeeRepo.findNameCustom(name);
//    }
}
