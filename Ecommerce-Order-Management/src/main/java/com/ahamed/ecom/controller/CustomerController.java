package com.ahamed.ecom.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahamed.ecom.entity.Customer;
import com.ahamed.ecom.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
	
	private  CustomerService customerService;
	
	@GetMapping("/get-all-customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@PostMapping("/save-customer")
	public Customer saveCustomer(@RequestBody Customer customer){
		return customerService.saveCustomer(customer);
	}
}
