package com.nigel.SpringCRUDDemo.dao;

import com.nigel.SpringCRUDDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
