package com.ahamed.ecom.repository;

import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.ahamed.ecom.entity.Customer;

public interface CustomerPageRepo extends ListPagingAndSortingRepository<Customer, Long> {
	

}
