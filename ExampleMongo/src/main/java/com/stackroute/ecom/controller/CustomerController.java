package com.stackroute.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.ecom.model.Customer;
import com.stackroute.ecom.services.CustomerServe;

 
@RestController
@RequestMapping("/api/mongo")
public class CustomerController {
	
	@Autowired
	CustomerServe service;
	
	
	@PostMapping("/addcustomer")
	public ResponseEntity addCust(@RequestBody Customer cust)
	{
	Customer cresult=service.addCustomer(cust);
	return new ResponseEntity<Customer>(cresult,HttpStatus.OK);
		
	}
	
	@GetMapping("/viewcustomer/{custid}")
	
	public ResponseEntity<?> viewcust(@PathVariable("custid") String custid)
	{
		Customer customer=service.findCustomer(custid);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}

	@GetMapping("/allcustomer")
	
	public ResponseEntity<?> viewcust()
	{
		List<Customer> customers=service.showall();
		return new ResponseEntity<List>(customers,HttpStatus.OK);
	}
	
}
