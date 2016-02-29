package com.keval.springTour.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keval.springTour.dao.DesignationDAO;
import com.keval.springTour.dao.EmployeeDAO;
import com.keval.springTour.entity.Employee;

@Controller
public class EmplyeeController{
	private EmployeeDAO employeeDAO;
	private DesignationDAO designationDAO;

	@RequestMapping({ "/employee/list" })
	public String list(Model model) {
	
		List<Employee> list = employeeDAO.listEmployee();
		for (Employee empl : list) {
		    System.out.println("Dept No " + empl.getFirstname());
		}
		model.addAttribute("employees", list);
		return "emplList";
	}
}
