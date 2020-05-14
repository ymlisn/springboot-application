package com.example.course.services;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){

        return repository.findAll();

    }

    public Order findById(Long id){

        Optional<Order> obj = repository.findById(id);
        return obj.get();

    }

}
