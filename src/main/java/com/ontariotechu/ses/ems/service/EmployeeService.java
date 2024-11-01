package com.ontariotechu.ses.ems.service;

import com.ontariotechu.ses.ems.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    Optional<Employee> getEmployeeById(int id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
