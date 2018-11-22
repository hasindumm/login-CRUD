package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Customer2;

@Repository
public class Customer2DAOImpl implements Customer2DAO {

	// need to inject the session factory
		@Autowired
		private SessionFactory sessionFactory2;
	
		@Override
		public List<Customer2> getCustomers2(){
			
			// get the current hibernate session
			Session currentSession2 = sessionFactory2.getCurrentSession();
			
			// create a query
			Query<Customer2> theQuery2 = 
					currentSession2.createQuery("from Customer2", Customer2.class);
			
			// execute query and get result list
			List<Customer2> customers2 = theQuery2.getResultList();
			
			return customers2;
			
		}
		
		
		
		
		@Override
		public void saveCustomer2(Customer2 theCustomer2) {
			
			//get current hibernate session
			
			Session currentSession2 = sessionFactory2.getCurrentSession();
			
			//save the customer
			currentSession2.saveOrUpdate(theCustomer2);
		}

		
		@Override
		public Customer2 getCustomer2(int theId2) {

			// get the current hibernate session
			Session currentSession2 = sessionFactory2.getCurrentSession();
			
			// now retrieve/read from database using the primary key
			Customer2 theCustomer2 = currentSession2.get(Customer2.class, theId2);
			
			return theCustomer2;	
			
		}
		

		@Override
		public void deleteCustomer2(int theId2) {

			// get the current hibernate session
			Session currentSession2 = sessionFactory2.getCurrentSession();
			
			// delete object with primary key
			Query theQuery2 = 
					currentSession2.createQuery("delete from Customer2 where id=:customerId2");
			theQuery2.setParameter("customerId2", theId2);
			
			theQuery2.executeUpdate();		
		}
		
		
}
