package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Integer saveEmp(Employee employee);
    public List<Employee> getAllEmp();
    public Optional<Employee> getOneEmp(Integer id);
}
