package com.ahamed.ecom.repository;

import org.springframework.data.repository.ListPagingAndSortingRepository;
import com.ahamed.ecom.entity.Category;

public interface CategoryPageRepo extends ListPagingAndSortingRepository<Category, Long>{

}
