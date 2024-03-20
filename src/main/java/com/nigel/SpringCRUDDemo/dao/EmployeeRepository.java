package com.nigel.SpringCRUDDemo.dao;

import com.nigel.SpringCRUDDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }
