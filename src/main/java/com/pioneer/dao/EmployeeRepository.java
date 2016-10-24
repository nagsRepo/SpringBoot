package com.pioneer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pioneer.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query(value = "SELECT * FROM test.Employee  where social= :social" , nativeQuery = true)
	 public Employee findBySocial(@Param("social")String social);
	
	@Query(value = "SELECT * FROM test.Employee" , nativeQuery = true)
	 public List<Employee> findAll();


	@SuppressWarnings("unchecked")
	public Employee save(Employee employee);
	
}
