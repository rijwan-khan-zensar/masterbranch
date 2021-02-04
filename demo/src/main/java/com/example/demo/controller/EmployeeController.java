package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/empsave")
    public ResponseEntity<String> saveEmp(@RequestBody Employee employee) {
        Integer empId = service.saveEmp(employee);
        if (empId != null) {
            return new ResponseEntity<String>("emp succesfully save" + empId + "", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("some internal error", HttpStatus.OK);

        }
    }

    @GetMapping("/getAllEmp")
    public ResponseEntity<?> getAllEmp() {
        List<Employee> employees = service.getAllEmp();
        if (employees != null) {

            return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("internal server problem", HttpStatus.OK);
        }
    }
    @GetMapping("/getOne")
    public ResponseEntity<Employee> getOneEmp(@RequestParam("sid") Integer id){
        Employee emp=service.getOneEmp(id).get();
        return new ResponseEntity<>(emp,HttpStatus.OK);
    }

}
