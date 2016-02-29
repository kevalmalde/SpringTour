package com.keval.springTour.dao;

import java.util.List;

import com.keval.springTour.entity.Designation;
import com.keval.springTour.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> listEmployee();
	public void createDepartment(String firstname, String lastname, Integer age, Designation designation); 
}