package com.jjoaooliveira.kanban.module.user.infrastructure.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjoaooliveira.kanban.module.user.application.ReadUser;
import com.jjoaooliveira.kanban.module.user.application.UserRequest;
import com.jjoaooliveira.kanban.module.user.application.UserResponse;

@RestController
@RequestMapping("/user")
public class ReadUserController {
    private final ReadUser readUserInteractor;

    public ReadUserController(ReadUser readUserInteractor) {
        this.readUserInteractor = readUserInteractor;
    }

    @GetMapping
    public EntityModel<UserResponse> readUser(UserRequest request) {
        UserResponse response = readUserInteractor.doRead(request);
        
        return EntityModel.of(response);
    }
}
