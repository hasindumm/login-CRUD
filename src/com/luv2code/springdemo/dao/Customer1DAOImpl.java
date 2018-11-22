package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Customer1;

@Repository
public class Customer1DAOImpl implements Customer1DAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory1;
	
		@Override
		public List<Customer1> getCustomers1(){
			
			// get the current hibernate session
			Session currentSession1 = sessionFactory1.getCurrentSession();
			
			// create a query
			Query<Customer1> theQuery1 = 
					currentSession1.createQuery("from Customer1", Customer1.class);
			
			// execute query and get result list
			List<Customer1> customers1 = theQuery1.getResultList();
			
			return customers1;
			
		}
		
		
		
		
		@Override
		public void saveCustomer1(Customer1 theCustomer1) {
			
			//get current hibernate session
			
			Session currentSession1 = sessionFactory1.getCurrentSession();
			
			//save the customer
			currentSession1.saveOrUpdate(theCustomer1);
		}

		
		@Override
		public Customer1 getCustomer1(int theId1) {

			// get the current hibernate session
			Session currentSession1 = sessionFactory1.getCurrentSession();
			
			// now retrieve/read from database using the primary key
			Customer1 theCustomer1 = currentSession1.get(Customer1.class, theId1);
			
			return theCustomer1;	
			
		}
		

		@Override
		public void deleteCustomer1(int theId1) {

			// get the current hibernate session
			Session currentSession1 = sessionFactory1.getCurrentSession();
			
			// delete object with primary key
			Query theQuery1 = 
					currentSession1.createQuery("delete from Customer1 where id=:customerId1");
			theQuery1.setParameter("customerId1", theId1);
			
			theQuery1.executeUpdate();		
		}
		
		
}
