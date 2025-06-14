package com.jjoaooliveira.kanban.module.user.application;

import com.jjoaooliveira.kanban.module.user.domain.Email;
import com.jjoaooliveira.kanban.module.user.domain.Name;
import com.jjoaooliveira.kanban.module.user.domain.Password;
import com.jjoaooliveira.kanban.module.user.domain.User;

public class CreateUser {
    private UserDataGatewayInterface dataGateway;

    public CreateUser(UserDataGatewayInterface dataGateway) {
        this.dataGateway = dataGateway;
    }

    public void doCreate(UserRequest request) {
        Name name = new Name(request.name());
        Email email = new Email(request.email());
        Password password = new Password(request.password());
        User user = new User(null, name, email, password);
        dataGateway.save(user);
    }
}
