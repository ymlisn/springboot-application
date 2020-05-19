package com.example.course.services;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){

        return repository.findAll();

    }

    public User findById(Long id){

        Optional<User> obj = repository.findById(id);
        return obj.get();

    }

    public User insert(User obj){

        return repository.save(obj);

    }


    public void delete(Long id){

        repository.deleteById(id);

    }



}
