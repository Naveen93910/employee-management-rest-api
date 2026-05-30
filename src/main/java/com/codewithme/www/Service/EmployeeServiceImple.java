package com.codewithme.www.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithme.www.Model.Employee;
import com.codewithme.www.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImple implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	public Employee saveEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(Long id)
	{
		employeeRepository.deleteById(id);
	}
	
	public Employee findById(Long id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee>findAll()
	{
		return employeeRepository.findAll();
	}
}
