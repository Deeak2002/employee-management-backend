package com.deepak.backend.service;

import com.deepak.backend.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    Page<Employee> getAllEmployees(Pageable pageable);
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    Page<Employee> searchEmployeesByName(String keyword, Pageable pageable);
}
