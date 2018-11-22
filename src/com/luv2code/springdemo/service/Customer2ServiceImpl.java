package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.Customer2DAO;

import com.luv2code.springdemo.entity.Customer2;

@Service
public class Customer2ServiceImpl implements Customer2Service {

	
	// need to inject customer dao
		@Autowired
		private Customer2DAO customer2DAO;
		
		@Override
		@Transactional
		public List<Customer2> getCustomers2() {
			return customer2DAO.getCustomers2();
		}
		
		
		@Override
		@Transactional
		public void saveCustomer2(Customer2 theCustomer2) {
			
			customer2DAO.saveCustomer2(theCustomer2);
		}
		

		@Override
		@Transactional
		public Customer2 getCustomer2(int theId2) {
			// TODO Auto-generated method stub
			return customer2DAO.getCustomer2(theId2);
		}

		@Override
		@Transactional
		public void deleteCustomer2(int theId2) {
			
			customer2DAO.deleteCustomer2(theId2);
		}


}
