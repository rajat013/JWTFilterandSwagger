package com.stackroute.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@CrossOrigin
@RestController
@RequestMapping("/api/ustg")
public class ProductController {

	
	@Autowired
	ProductDAO prodao;
	
	@ApiOperation(value="To Retrive the product detail by providing productid")
	 
	@GetMapping("/getall")
	public ResponseEntity<?> getall()
	{
		 String prodname=prodao.getProductDetails("P001");
		 
		 return new ResponseEntity<String>("Product name" + prodname,HttpStatus.OK);
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<?> saverec(@RequestBody Product product)
	{
		String s=prodao.saveProduct(product);
		
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}
	
	
}
