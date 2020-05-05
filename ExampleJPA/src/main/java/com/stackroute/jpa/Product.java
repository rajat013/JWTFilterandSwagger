package com.stackroute.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	String productid;
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	String pname;
	String category_id;
	
	public String toString()
	{
		return "Produc id " + productid + " Name " + pname + " Category " + category_id;
	}
	
	
}
