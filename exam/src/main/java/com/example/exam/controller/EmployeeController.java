package com.example.exam.controller;

import com.example.exam.entity.EmployeeEntity;
import com.example.exam.model.BaseResponse;
import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public BaseResponse getEmployee(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
//        Integer id = Integer.valueOf((String)params.get("id"));
//        String name = params.get("name");
//        Integer wage = Integer.valueOf((String)params.get("wage"));

        res.data = employeeService.getAllEmployee();
        return res;
    }

    @PostMapping
    public BaseResponse createEmployee(@RequestBody EmployeeEntity employee) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.createEmployee(employee);
        return res;
    }
}
