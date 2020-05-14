package com.example.course.services;

import com.example.course.entities.Category;
import com.example.course.entities.User;
import com.example.course.repositories.CategoryRepository;
import com.example.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService {

    @Autowired
    private CategoryRepository category;

    public List<Category> findAll(){

        return category.findAll();

    }

    public Category findById(Long id){

        Optional<Category> obj = category.findById(id);
        return obj.get();

    }

}
