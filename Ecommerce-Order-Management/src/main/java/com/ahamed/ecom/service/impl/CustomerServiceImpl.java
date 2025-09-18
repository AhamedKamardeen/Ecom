package com.ahamed.ecom.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	private  CustomerCrudRepo customerCrudRepo;
	private   CustomerPageRepo customerPageRepo;
	private  CustomerJPARepo customerJPARepo;
	
	
	@Autowired
	public CustomerServiceImpl(CustomerCrudRepo customerCrudRepo, CustomerPageRepo customerPageRepo,
			CustomerJPARepo customerJPARepo) {
		super();
		this.customerCrudRepo = customerCrudRepo;
		this.customerPageRepo = customerPageRepo;
		this.customerJPARepo = customerJPARepo;
	}


	@Override
	public List<Customer> getAllCustomer() {
		return customerJPARepo.findAll();
//		return null;
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		return customerJPARepo.save(customer);
	}


	@Override
	public Customer getCustomerById(long id) {
		return customerJPARepo.findById(id).isPresent() ? customerJPARepo.findById(id).get() : null;
	}


	@Override
	public Customer updateCustById(long id, Customer customer) {
		// TODO Auto-generated method stub
		Customer cust= customer;
		cust.setId(id);
		return customerJPARepo.save(cust);
	}


	@Override
	public String deleteCustById(long id) {
		String status="";
		try {
			customerJPARepo.deleteById(id);
			status="deleted Successfullt........";
			
		}catch (Exception e) {
			status="error";
			e.printStackTrace();
		}
		return status;
		
	}
	
	


}
