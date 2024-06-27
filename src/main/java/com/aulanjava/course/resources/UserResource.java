package com.aulanjava.course.resources;

import com.aulanjava.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Vinicius", "vinicius.paim@proton.me", "9999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
