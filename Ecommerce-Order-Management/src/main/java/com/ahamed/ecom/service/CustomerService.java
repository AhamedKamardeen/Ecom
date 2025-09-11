package com.ahamed.ecom.service;

import java.util.List;

import com.ahamed.ecom.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomer();

	Customer saveCustomer(Customer customer);

}
