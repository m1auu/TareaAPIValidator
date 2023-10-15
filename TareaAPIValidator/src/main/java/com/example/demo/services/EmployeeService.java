package com.example.demo.services;

import java.util.ArrayList;
import com.example.demo.model.Employee;


public interface EmployeeService {
		
	public ArrayList<Employee> getAllEmployee();
		
	public Employee saveEmployee(Employee employee);

}

