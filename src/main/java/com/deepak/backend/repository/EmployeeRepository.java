package com.deepak.backend.repository;

import com.deepak.backend.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findByNameContainingIgnoreCaseOrJobTitleContainingIgnoreCase(String name, String jobTitle, Pageable pageable);
}
