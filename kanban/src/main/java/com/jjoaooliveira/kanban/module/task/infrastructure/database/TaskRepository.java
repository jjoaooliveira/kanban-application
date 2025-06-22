package com.jjoaooliveira.kanban.module.task.infrastructure.database;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
    Set<TaskEntity> getTaskByKanbanId(Long id);
}
