package com.ahamed.ecom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahamed.ecom.entity.Customer;
import com.ahamed.ecom.repository.CustomerCrudRepo;
import com.ahamed.ecom.repository.CustomerJPARepo;
import com.ahamed.ecom.repository.CustomerPageRepo;
import com.ahamed.ecom.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{
	
	private final CustomerCrudRepo customerCrudRepo;
	private final  CustomerPageRepo customerPageRepo;
	private final CustomerJPARepo customerJPARepo;
	
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerJPARepo.findAll();
//		return null;
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		return customerJPARepo.save(customer);
	}

}
