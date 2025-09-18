package com.ahamed.ecom.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahamed.ecom.entity.Customer;
import com.ahamed.ecom.service.CustomerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	private  CustomerService customerService;
	
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/get-all-customer")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@PostMapping("/save-customer")
	public Customer saveCustomer(@RequestBody Customer customer){
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/get-customer-by-id/{id}")
	public Customer getCustomerById(@PathVariable("id") long id) {
		return customerService.getCustomerById(id);
	}
	
	@PostMapping("/update-cust-by-id/{id}")
	public Customer updateCustById(@RequestBody Customer customer , @PathVariable("id") long id) {
		return customerService.updateCustById(id,customer);
	}
	
	@PostMapping("/delete-cust-by-id/{id}")
	public String deleteCustById(@PathVariable("id") long id) {
		return customerService.deleteCustById(id);
	}
}
