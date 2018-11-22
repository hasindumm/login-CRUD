package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Customer1;

public interface Customer1Service {

	
	public List<Customer1> getCustomers1();
	
	public void saveCustomer1(Customer1 theCustomer1);
	
	
	public Customer1 getCustomer1(int theId1);
	
	public void deleteCustomer1(int theId1);
}
