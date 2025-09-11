package com.ahamed.ecom.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.ahamed.ecom.entity.Category;

public interface CategoryCrudRepo extends ListCrudRepository<Category, Long>{

}
