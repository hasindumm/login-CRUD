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

import com.luv2code.springdemo.entity.Customer2;

import com.luv2code.springdemo.service.Customer2Service;




@Controller
@RequestMapping("/customer")
public class Customer2Controller {

	
	// need to inject our customer service
			@Autowired
			private Customer2Service customer2Service;
	
	
	
	@GetMapping("/reservation")
	public String reservation() {
				
		
		return "reservation-form";
	}
	
	
	@GetMapping("/showReservation")
	public String showReservation(Model theModel2) {
				
		
		
				List<Customer2> theCustomers2 = customer2Service.getCustomers2();
						
			
				
				theModel2.addAttribute("customers2", theCustomers2);
				
		
		
		
		
		return "showreservation-form";
	}
	

	@PostMapping("/saveCustomer2")
	public String saveCustomer2(@ModelAttribute("customer2") Customer2 theCustomer2) {
		
	//save the customer using our service
		customer2Service.saveCustomer2(theCustomer2);
		
		
		return "redirect:/customer/showReservation";
	}
	
	@GetMapping("/showFormForAdd2")
	public String showFormForAdd2(Model theModel2) {
		
		Customer2 theCustomer2 = new Customer2();
		
		theModel2.addAttribute("customer2", theCustomer2);
		
		
		return "customer2-form";
	}
	
	@GetMapping("/showFormForUpdate2")
	public String showFormForUpdate2(@RequestParam("customerId2") int theId2,
									Model theModel2) {
		
		// get the customer from our service
		Customer2 theCustomer2 = customer2Service.getCustomer2(theId2);	
		
		// set customer as a model attribute to pre-populate the form
		theModel2.addAttribute("customer2", theCustomer2);
		
		// send over to our form		
		return "customer2-form";
	}
	

	@GetMapping("/delete2")
	public String deleteCustomer2(@RequestParam("customerId2") int theId2) {
		
		// delete the customer
		customer2Service.deleteCustomer2(theId2);
		
		return "redirect:/customer/showReservation";
	}
}

