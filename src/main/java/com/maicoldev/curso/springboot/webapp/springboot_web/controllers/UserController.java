package com.maicoldev.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.maicoldev.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Maicol", "Hernández");
        user.setEmail("maicol@maicoldev");
        model.addAttribute("title", "User Details");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Lalo", "Perez", "lalo@lalo"),
                new User("Juanita", "Roe", "juanita@juanita"),
                new User("Andres", "Doe"));

        model.addAttribute("users", users);
        model.addAttribute("title", "User List");
        return "list";
    }
}
