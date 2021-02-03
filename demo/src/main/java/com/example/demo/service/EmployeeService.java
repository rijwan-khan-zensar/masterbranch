package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Integer saveEmp(Employee employee);
    public List<Employee> getAllEmp();
}
