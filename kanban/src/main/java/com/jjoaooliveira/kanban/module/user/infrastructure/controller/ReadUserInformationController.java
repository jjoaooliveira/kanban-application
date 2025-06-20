package com.jjoaooliveira.kanban.module.user.infrastructure.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjoaooliveira.kanban.module.user.application.UserResponse;

@Controller
@RequestMapping("/profile")
public class ReadUserInformationController {
    
    @GetMapping
    public String readUser(Authentication authentication, Model model) {
        User userAuthenticated = (User) authentication.getPrincipal();
        UserResponse response = new UserResponse(
            null, userAuthenticated.getUsername(), "email@email.com");
        model.addAttribute("user", response);

        return "profile";
    }
}
