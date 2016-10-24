package com.pioneer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pioneer.dao.EmployeeRepository;
import com.pioneer.model.Employee;
import com.pioneer.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repo;
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/createEmployee", method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		System.out.println(employee);
		return employee;
	}

	@RequestMapping(value = "/getEmployee/{employeeId}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee(@PathVariable String employeeId) {
		Employee employee = repo.findBySocial(employeeId);
		System.out.println("inside getEmployee ");
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(value = "/getSalary", method = RequestMethod.GET)
	public int getSalary(Employee employee) {
		int salary = employeeService.getSalary();
		return salary;
	}
	
	@RequestMapping(value = "/getEmployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
