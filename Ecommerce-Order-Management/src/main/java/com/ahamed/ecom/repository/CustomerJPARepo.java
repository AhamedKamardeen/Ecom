package com.ahamed.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.ahamed.ecom.entity.Customer;

public interface CustomerJPARepo extends JpaRepository<Customer, Long> {
	

}
