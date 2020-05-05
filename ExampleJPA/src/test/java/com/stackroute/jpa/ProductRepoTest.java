package com.stackroute.jpa;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)

public class ProductRepoTest {
    
	@Autowired
	ProductRepo repo;

	 Product product;

	 @Before
	 public void setup() throws Exception
	 {
		 product=new Product();
		 product.setCategory_id("C00");
		 product.setPname("HP monitor");
		 product.setProductid("P10");
		 
	 }
	 
	 @Test
	 public void testbook() throws Exception
	 {
		 repo.save(product);
		 Product prd=repo.findByProductid("P10");
		 Assert.assertEquals(prd.getPname(), product.getPname());
	 }
	 
}


