package com.example.course.resources;

import com.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findall(){


        User u = new User(1L,"yann","ymclins@gmail.com","83996909607","36051765");

        return ResponseEntity.ok().body(u);


    }

}
