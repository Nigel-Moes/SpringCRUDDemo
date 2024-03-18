package com.nigel.SpringCRUDDemo.service;

import com.nigel.SpringCRUDDemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
