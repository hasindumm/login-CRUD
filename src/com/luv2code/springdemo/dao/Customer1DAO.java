package com.luv2code.springdemo.dao;

import java.util.List;


import com.luv2code.springdemo.entity.Customer1;

public interface Customer1DAO {


	public List<Customer1> getCustomers1();

	public void saveCustomer1(Customer1 theCustomer1);
	
	public Customer1 getCustomer1(int theId1);
	
	
	public void deleteCustomer1(int theId1);
	
}
