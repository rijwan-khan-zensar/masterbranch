package com.example.demo.serviceImp;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    @Override
    public Integer saveEmp(Employee employee) {
        Integer employee1id = repo.save(employee).getEmpId();
        return employee1id;
    }

    @Override
    public List<Employee> getAllEmp() {
        return  repo.findAll();
    }

    @Override
    public  Optional<Employee>  getOneEmp(Integer id) {
        Optional<Employee> emp=repo.findById(id);
        return emp;
    }


}
