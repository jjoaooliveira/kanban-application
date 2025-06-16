package com.jjoaooliveira.kanban.module.user.infrastructure.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjoaooliveira.kanban.module.user.application.ReadUserInformation;
import com.jjoaooliveira.kanban.module.user.application.UserRequest;
import com.jjoaooliveira.kanban.module.user.application.UserResponse;

@RestController
@RequestMapping("/user")
public class ReadUserInformationController {
    private final ReadUserInformation readUserInteractor;

    public ReadUserInformationController(ReadUserInformation readUserInteractor) {
        this.readUserInteractor = readUserInteractor;
    }

    @GetMapping
    public EntityModel<UserResponse> readUser(UserRequest request) {
        UserResponse response = readUserInteractor.doRead(request);
        
        return EntityModel.of(response);
    }
}
