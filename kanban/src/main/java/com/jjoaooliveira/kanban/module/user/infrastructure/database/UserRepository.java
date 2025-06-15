package com.jjoaooliveira.kanban.module.user.infrastructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
