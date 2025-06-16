package com.jjoaooliveira.kanban.module.user.application;

import com.jjoaooliveira.kanban.module.user.domain.User;

public interface UserDataGatewayInterface {
    void save(User user);
    User readUserByEmail(String email);
}
