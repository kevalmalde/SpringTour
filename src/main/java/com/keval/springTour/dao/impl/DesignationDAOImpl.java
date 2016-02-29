package com.keval.springTour.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.keval.springTour.dao.DesignationDAO;
import com.keval.springTour.entity.Designation;

@Transactional
public class DesignationDAOImpl implements DesignationDAO{
   private SessionFactory sessionFactory;
   
   public void setSessionFactory(SessionFactory sessionFactory) {
       this.sessionFactory = sessionFactory;
   }
   
   @Override
   @SuppressWarnings("unchecked")
   public List<Designation> listDesignation() {
       Session session = this.sessionFactory.getCurrentSession();
 
       List<Designation> list = session.createQuery("from Designation").list();
 
       return list;
   }

}
