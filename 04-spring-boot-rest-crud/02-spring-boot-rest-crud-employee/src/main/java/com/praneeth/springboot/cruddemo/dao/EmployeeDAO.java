package com.praneeth.springboot.cruddemo.dao;

import com.praneeth.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}