package com.pioneer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pioneer.dao.EmployeeRepository;
import com.pioneer.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public int getSalary(){
		
		int salary = 0;
		List<Employee> employeeList = repo.findAll();
		for (Employee employee2 : employeeList) {
			int age = employee2.getAge();
			if (age > 25) {
				if(employee2.getSalary() == null)
				{
					employee2.setSalary(0);
				}
				else{
				salary = employee2.getSalary();
				salary = salary + (salary * 20 / 100);
			}
			}

		}
		return salary;
	}

}
