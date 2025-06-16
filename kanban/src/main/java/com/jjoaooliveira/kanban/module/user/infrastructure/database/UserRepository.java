package com.jjoaooliveira.kanban.module.user.infrastructure.database;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    public Optional<UserEntity> getByEmail(String email);
}
