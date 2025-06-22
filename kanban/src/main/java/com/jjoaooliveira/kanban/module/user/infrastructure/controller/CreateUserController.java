package com.jjoaooliveira.kanban.module.user.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjoaooliveira.kanban.module.user.application.CreateUser;
import com.jjoaooliveira.kanban.module.user.application.UserRequest;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/signup")
public class CreateUserController {
    private final CreateUser createUserInteractor;

    public CreateUserController(CreateUser createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
    }

    @GetMapping
    public String getPage() {
        return "signup";
    }
    
    @PostMapping
    public String createUser(@RequestBody UserRequest request) {
        createUserInteractor.doCreate(request);
        return "redirect:/login";
    }
}
