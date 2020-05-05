package com.stackroute.ecom.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.ecom.model.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer,String>
{
   public Customer findByCid(String name);
}
