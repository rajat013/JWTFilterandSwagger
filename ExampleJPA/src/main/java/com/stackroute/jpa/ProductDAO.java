package com.stackroute.jpa;

public interface ProductDAO {
	
	public String saveProduct(Product pro);
	public String getProductDetails(String pid);

}
