package com.prowings.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Employee;
import com.prowings.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) throws URISyntaxException {
		return service.saveEmployee(employee);
	}
}
