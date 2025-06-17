package com.jjoaooliveira.kanban.module.task.application;

import java.util.Set;

import com.jjoaooliveira.kanban.module.task.domain.Task;

public interface TaskDataGateway {
    Task saveTask(Task task);
    Task updateTask(Task task);
    void deleteTask(Task task);
    Set<Task> readTasksByKanbanId(Long id);
}
