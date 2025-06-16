package com.jjoaooliveira.kanban.module.user.application;

import com.jjoaooliveira.kanban.module.user.domain.User;

public class ReadUserInformation {
    private UserDataGatewayInterface dataGateway;

    public ReadUserInformation(UserDataGatewayInterface dataGateway) {
        this.dataGateway = dataGateway;
    }

    public UserResponse doRead(UserRequest request) {
        User user = dataGateway.readUserByEmail(request.email());

        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }
}
