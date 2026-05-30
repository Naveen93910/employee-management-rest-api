package com.codewithme.www.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithme.www.Model.Employee;
import com.codewithme.www.Service.EmployeeServiceImple;

@RestController
public class EmployeeController {
	
	@Autowired 
	EmployeeServiceImple employeeServiceImple;
	
	@PostMapping("/Insert")
	public Employee saveEmployee(@RequestBody Employee employee)
	
	{
		return employeeServiceImple.saveEmployee(employee);
	}
	
	@PutMapping("/Update")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeServiceImple.saveEmployee(employee);
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteEmployee(@PathVariable Long id)
	{
		employeeServiceImple.deleteEmployee(id);
		return "Succefully Deleted";
	}
	
	@GetMapping("/Get")
	public List<Employee>findAll()
	{
		return employeeServiceImple.findAll();
	}
	
	@GetMapping("/Get/{id}")
	public Employee findById(@PathVariable Long id)
	{
		return employeeServiceImple.findById(id);
	}
	

}
