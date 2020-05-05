package com.stackroute.ecom.services;

import java.util.List;

import com.stackroute.ecom.model.Customer;

public interface CustomerServe {
   
	Customer addCustomer(Customer cust);
    Customer findCustomer(String cid);	
	 List<Customer> showall();
}
