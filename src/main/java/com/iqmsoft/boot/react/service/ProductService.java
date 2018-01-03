package com.iqmsoft.boot.react.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.boot.react.model.Product;
import com.iqmsoft.boot.react.repository.EmployeeRepository;

@Service
public class ProductService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Iterable<Product> findAll(){
        return employeeRepository.findAll();
    }

    public void delete(Long id){
        employeeRepository.deleteById(id);
    }

    public void save(Product product) {
        employeeRepository.save(product);
    }

    public Optional<Product> findOneById(Long productId) {
        return employeeRepository.findById(productId);
    }
}
