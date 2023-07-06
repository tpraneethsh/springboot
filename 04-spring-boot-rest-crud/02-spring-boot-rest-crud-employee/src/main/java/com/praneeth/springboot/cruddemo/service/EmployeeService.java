package com.praneeth.springboot.cruddemo.service;

import com.praneeth.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
