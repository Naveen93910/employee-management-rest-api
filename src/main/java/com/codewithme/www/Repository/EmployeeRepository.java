package com.codewithme.www.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codewithme.www.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}
