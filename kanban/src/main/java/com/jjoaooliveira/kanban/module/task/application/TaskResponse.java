package com.jjoaooliveira.kanban.module.task.application;

import java.time.OffsetDateTime;

import com.jjoaooliveira.kanban.module.task.domain.Task;

public record TaskResponse(Long id, String title, String description, OffsetDateTime date, Long kanbanId) {
    public static TaskResponse fromEntity(Task task) {
        return new TaskResponse(
            task.getId(), 
            task.getTitle(), 
            task.getDescription(), 
            task.getDate(), 
            task.getKanbanReference()
        );
    }
}
