package com.example.demo.Entities.Controller;


import com.example.demo.Entities.Models.Employee;
import com.example.demo.Entities.ServicesImp.EmployeeService;
import com.example.demo.Entities.Interface.EmployeeServiceInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/employee")
public class EmployeeController {

    private EmployeeServiceInt service;

    @GetMapping
    public List<Employee> getEmployee ()
    {
         service = new EmployeeService();

        return this.service.getEmployee();
    }


}
