package com.example.demo.model;

import jdk.jfr.DataAmount;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "empid")
    private Integer empId;
    @Column(name = "empname")
    private  String empName;
    @Column(name = "empadd")
    private String empAdd;
    @Column(name = "empsal")
    private Double empSal;

    public Employee() {
    }

    public Employee(Integer empId, String empName, String empAdd, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.empSal = empSal;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public Double getEmpSal() {
        return empSal;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public void setEmpSal(Double empSal) {
        this.empSal = empSal;
    }

    }

