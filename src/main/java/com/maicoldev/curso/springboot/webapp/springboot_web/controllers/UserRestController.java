package com.maicoldev.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maicoldev.curso.springboot.webapp.springboot_web.dto.UserDto;
import com.maicoldev.curso.springboot.webapp.springboot_web.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Maicol", "Hernández");

        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("User Details");

        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Maicol", "Hernández");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "User Details");
        body.put("user", user);
        return body;
    }
}
