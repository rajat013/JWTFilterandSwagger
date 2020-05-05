package com.stackroute.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepo extends JpaRepository<Product,String>
{
	
  public Product findByProductid(String pid);
  public Product findByProductidAndPname(String pid,String pname);
	
}
