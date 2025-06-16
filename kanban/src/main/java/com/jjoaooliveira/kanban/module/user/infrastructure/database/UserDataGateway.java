package com.jjoaooliveira.kanban.module.user.infrastructure.database;

import com.jjoaooliveira.kanban.module.user.application.UserDataGatewayInterface;
import com.jjoaooliveira.kanban.module.user.domain.Email;
import com.jjoaooliveira.kanban.module.user.domain.Name;
import com.jjoaooliveira.kanban.module.user.domain.Password;
import com.jjoaooliveira.kanban.module.user.domain.User;

import jakarta.persistence.EntityNotFoundException;

public class UserDataGateway implements UserDataGatewayInterface {

    private final UserRepository repository;

    public UserDataGateway(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(User user) {
        UserEntity entity = new UserEntity(
            user.getId(), user.getName(), user.getEmail(), user.getPassword()
        );
        
        repository.save(entity);
    }

    @Override
    public User readUserByEmail(String email) {
        UserEntity entity = repository.getByEmail(email).orElseThrow(
            () -> new EntityNotFoundException("User not found")
        );

        Name queriedName = new Name(entity.getName());
        Email queriedEmail = new Email(entity.getEmail());
        Password queriedPassword = new Password(entity.getPassword());
        User user = new User(entity.getId(), queriedName, queriedEmail, queriedPassword);

        return user;
    }

}
