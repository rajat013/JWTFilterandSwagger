package com.stackroute.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.ecom.model.Customer;
import com.stackroute.ecom.repo.CustomerRepo;

@Service
public class CustomerServeImpl implements CustomerServe {

	 @Autowired
	 CustomerRepo crepo;
	
	@Override
	public Customer addCustomer(Customer cust) {
		Customer customer=crepo.save(cust);
		return customer;
	}

	@Override
	public Customer findCustomer(String cid) {
		
		Customer cust=crepo.findByCid(cid);
		return cust;
	}

	@Override
	public List<Customer> showall() {
		return crepo.findAll();
	};

}
