package com.jjoaooliveira.kanban.module.user.infrastructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjoaooliveira.kanban.module.user.application.CreateUser;
import com.jjoaooliveira.kanban.module.user.application.UserRequest;

@RestController
@RequestMapping("/user")
public class CreateUserController {
    private final CreateUser createUserInteractor;

    public CreateUserController(CreateUser createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
    }
    
    @PostMapping
    public HttpStatus createUser(UserRequest request) {
        createUserInteractor.doCreate(request);
        
        return HttpStatus.OK;
    }
}
