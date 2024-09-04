package com.employee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
