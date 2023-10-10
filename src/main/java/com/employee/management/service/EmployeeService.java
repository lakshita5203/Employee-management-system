package com.employee.management.service;

import com.employee.management.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(Long id);

    void deleteById(Long id);
}
