package com.example.course.services;

import com.example.course.entities.Product;
import com.example.course.entities.User;
import com.example.course.repositories.ProductRepository;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){

        return repository.findAll();

    }

    public Product findById(Long id){

        Optional<Product> obj = repository.findById(id);
        return obj.get();

    }

}
