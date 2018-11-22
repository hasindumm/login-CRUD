package com.luv2code.springdemo.service;

import java.util.List;


import com.luv2code.springdemo.entity.Customer2;

public interface Customer2Service {

	
	public List<Customer2> getCustomers2();
	
	public void saveCustomer2(Customer2 theCustomer2);
	
	
	public Customer2 getCustomer2(int theId2);
	
	public void deleteCustomer2(int theId2);
}
