package com.codewithme.www.Service;

import java.util.List;

import com.codewithme.www.Model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee employee);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Long id);
	
	public Employee findById(Long id);
	
	public List<Employee> findAll();
	

}
