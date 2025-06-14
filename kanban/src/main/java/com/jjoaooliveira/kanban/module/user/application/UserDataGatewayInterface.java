package com.jjoaooliveira.kanban.module.user.application;

import java.util.Optional;

import com.jjoaooliveira.kanban.module.user.domain.User;

public interface UserDataGatewayInterface {
    void save(User user);
    Optional<User> readUserByEmail(String email);
}
