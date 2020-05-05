package com.stackroute.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	ProductRepo prepo;
	
	@Override
	public String saveProduct(Product pr) {
		 prepo.save(pr);
		 return "yes";
	}

	@Override
	public String getProductDetails(String pid) 
	{
	Product product=prepo.findByProductid(pid);
	return product.getPname();
	  }

}
