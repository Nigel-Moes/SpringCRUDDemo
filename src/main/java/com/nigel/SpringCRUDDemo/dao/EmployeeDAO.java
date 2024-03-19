package com.nigel.SpringCRUDDemo.dao;

import com.nigel.SpringCRUDDemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
