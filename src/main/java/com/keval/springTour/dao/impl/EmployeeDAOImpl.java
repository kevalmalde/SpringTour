package com.keval.springTour.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.keval.springTour.dao.EmployeeDAO;
import com.keval.springTour.entity.Designation;
import com.keval.springTour.entity.Employee;

@Transactional
public class EmployeeDAOImpl implements EmployeeDAO{
	 
	private SessionFactory sessionFactory;
	 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployee() {
		Session session = this.sessionFactory.getCurrentSession();
	
		List<Employee> list = session.createQuery("from Employee").list();
	
		return list;
	}

	@Override
	public void createDepartment(String firstname, String lastname, Integer age, Designation designation) {
		Employee empl = new Employee();
		empl.setFirstname(firstname);
		empl.setLastname(lastname);
		empl.setAge(age);
		empl.setDesignation(designation);
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(empl);
	}
}
