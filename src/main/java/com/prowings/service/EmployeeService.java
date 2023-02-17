package com.prowings.service;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prowings.model.Employee;

@Service
public class EmployeeService {

	RestTemplate template = new RestTemplate();

	@Value("${baseUrl}")
	String url;

	public Employee saveEmployee(Employee employee) throws  URISyntaxException {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");

		HttpEntity<Employee> entity = new HttpEntity<>(employee, headers);

		return template.postForEntity(url, employee, Employee.class).getBody();
	}

}
