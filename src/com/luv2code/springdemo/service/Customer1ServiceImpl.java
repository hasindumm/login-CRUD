package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.Customer1DAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Customer1;

@Service
public class Customer1ServiceImpl implements Customer1Service {

	
	// need to inject customer dao
		@Autowired
		private Customer1DAO customer1DAO;
		
		@Override
		@Transactional
		public List<Customer1> getCustomers1() {
			return customer1DAO.getCustomers1();
		}
		
		
		@Override
		@Transactional
		public void saveCustomer1(Customer1 theCustomer1) {
			
			customer1DAO.saveCustomer1(theCustomer1);
		}
		

		@Override
		@Transactional
		public Customer1 getCustomer1(int theId1) {
			// TODO Auto-generated method stub
			return customer1DAO.getCustomer1(theId1);
		}

		@Override
		@Transactional
		public void deleteCustomer1(int theId1) {
			
			customer1DAO.deleteCustomer1(theId1);
		}
}
