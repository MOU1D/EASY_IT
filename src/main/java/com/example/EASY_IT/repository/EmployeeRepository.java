package com.example.EASY_IT.repository;

import com.example.EASY_IT.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}