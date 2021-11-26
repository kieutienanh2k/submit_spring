package com.example.exam.controller;


import com.example.exam.entity.EmployeeEntity;
import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/","/index"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.getAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/insert"})
    public String insert(Model model) {
//        List<EmployeeEntity> employees = employeeService.getAllEmployee();
//        model.addAttribute("employees", employees);
        return "insert";
    }

    @PostMapping({"/insert"})
    public String insert(@RequestParam Map<String, String> params) {
//        List<EmployeeEntity> employees = employeeService.getAllEmployee();
//        model.addAttribute("employees", employees);
        Integer id = Integer.valueOf((String)params.get("id"));
        String name = params.get("name");
        Integer wage = Integer.valueOf((String)params.get("wage"));

        return "insert";
    }


}
