package com.example.demo.Entities.ServicesImp;

import com.example.demo.Entities.Models.Employee;
import com.example.demo.Entities.Interface.EmployeeServiceInt;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements EmployeeServiceInt {
    private List<Employee> list;

    public EmployeeService() {

        Employee employee = new Employee(18,"Shaun","Male");
         list=new ArrayList<>();
         list.add(employee);
    }
    @Override
    public List<Employee> getEmployee ()
    {
        return list;
    }




}
