package com.ahamed.ecom.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.ahamed.ecom.entity.Customer;

public interface CustomerCrudRepo extends ListCrudRepository<Customer, Long> {
	
}
