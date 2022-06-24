package com.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String businessArea;
    private List<Employee> employeeList;

    public Company(String name, String businessArea) {
        this.name = name;
        this.businessArea = businessArea;
        employeeList = new ArrayList<>();
    }

    public Company(String name, String businessArea, List<Employee> employeeList){
        this(name, businessArea);
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public String getName() {
        return name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
