package com.stackroute.ecom.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	
	@Id
	String cid;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	String cname;
	
	Order customerorder;
	
	public Order getCustomerorder() {
		return customerorder;
	}
	public void setCustomerorder(Order customerorder) {
		this.customerorder = customerorder;
	}
	

}
