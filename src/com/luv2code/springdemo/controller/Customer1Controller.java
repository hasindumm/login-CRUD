package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.Customer1;
import com.luv2code.springdemo.service.Customer1Service;




@Controller
@RequestMapping("/customer")
public class Customer1Controller {

	
	// need to inject our customer service
			@Autowired
			private Customer1Service customer1Service;
	
	
	
	@GetMapping("/hardAsset")
	public String hardAsset() {
				
		
		return "hardasset-form";
	}
	
	
	@GetMapping("/showItem")
	public String showItem(Model theModel1) {
				
		
		// get customers from the service
				List<Customer1> theCustomers1 = customer1Service.getCustomers1();
						
				// add the customers to the model
				theModel1.addAttribute("customers1", theCustomers1);
				
		
		
		
		
		return "showitem-form";
	}
	
	@GetMapping("/showFormForAdd1")
	public String showFormForAdd1(Model theModel1) {
		
		Customer1 theCustomer1 = new Customer1();
		
		theModel1.addAttribute("customer1", theCustomer1);
		
		
		return "customer1-form";
	}
	
	
	
	@PostMapping("/saveCustomer1")
	public String saveCustomer1(@ModelAttribute("customer1") Customer1 theCustomer1) {
		
	//save the customer using our service
		customer1Service.saveCustomer1(theCustomer1);
		
		
		return "redirect:/customer/showItem";
	}
	
	@GetMapping("/showFormForUpdate1")
	public String showFormForUpdate1(@RequestParam("customerId1") int theId1,
									Model theModel1) {
		
		// get the customer from our service
		Customer1 theCustomer1 = customer1Service.getCustomer1(theId1);	
		
		// set customer as a model attribute to pre-populate the form
		theModel1.addAttribute("customer1", theCustomer1);
		
		// send over to our form		
		return "customer1-form";
	}
	

	@GetMapping("/delete1")
	public String deleteCustomer1(@RequestParam("customerId1") int theId1) {
		
		// delete the customer
		customer1Service.deleteCustomer1(theId1);
		
		return "redirect:/customer/showItem";
	}
	
	
	
}

