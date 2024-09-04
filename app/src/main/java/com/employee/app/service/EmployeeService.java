package com.employee.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.app.model.Employee;
import com.employee.app.repository.EmployeeRepo;
@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	public ResponseEntity<List<Employee>> getEmployees() {
		
		return new ResponseEntity<>(employeeRepo.findAll(),HttpStatus.OK);
	}

	public ResponseEntity<String> addUser(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
		return new ResponseEntity<>("sucess",HttpStatus.OK);
	}

	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);
		return "sucess deleted";
	}

	public String updateEmployee(Employee employee) {
		employeeRepo.save(employee);
		return "sucess updated";
	}

}
