package com.employee.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.model.Employee;
import com.employee.app.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	Employee employee;
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getEmployees")
	public ResponseEntity<List<Employee>> getEmployee(){
		return employeeService.getEmployees();
	}
	@PostMapping("addUser")
	public ResponseEntity<String>addUser(@RequestBody Employee employee){
		return employeeService.addUser(employee);
	}
	@DeleteMapping("deleteEmployee/{id}")
	public String delteUserById(@PathVariable int id) {
		return employeeService.deleteUser(id);
		
	}
	@PutMapping("updateEmployee/{id}")
	public String updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

}
