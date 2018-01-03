package com.iqmsoft.boot.react.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.iqmsoft.boot.react.model.Product;

public interface EmployeeRepository extends PagingAndSortingRepository<Product, Long> {
}