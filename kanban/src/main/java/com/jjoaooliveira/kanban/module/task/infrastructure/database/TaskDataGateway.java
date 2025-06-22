package com.jjoaooliveira.kanban.module.task.infrastructure.database;

import java.util.Set;
import java.util.stream.Collectors;

import com.jjoaooliveira.kanban.module.task.application.TaskDataGatewayInterface;
import com.jjoaooliveira.kanban.module.task.domain.Description;
import com.jjoaooliveira.kanban.module.task.domain.Task;
import com.jjoaooliveira.kanban.module.task.domain.Title;

public class TaskDataGateway implements TaskDataGatewayInterface {

    private TaskRepository repository;

    public TaskDataGateway(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public Task saveTask(Task task) {
        TaskEntity entity = converTaskToEntity(task);
        TaskEntity persistedEntity = repository.save(entity);  
        Task persistedTask = convertEntityToTask(persistedEntity);

        return persistedTask;
    }

    @Override
    public Task updateTask(Task task) {
        TaskEntity entity = converTaskToEntity(task);
        TaskEntity persistedEntity = repository.save(entity);
        Task updatedTask = convertEntityToTask(persistedEntity);

        return updatedTask;
    }

    @Override
    public void deleteTask(Task task) {
        TaskEntity entity = converTaskToEntity(task);
        repository.delete(entity);
    }

    @Override
    public Set<Task> readTasksByKanbanId(Long id) {
        Set<TaskEntity> entities = repository.getTaskByKanbanId(id);
        Set<Task> tasks = entities
            .stream()
            .map(this::convertEntityToTask)
            .collect(Collectors.toSet());
        return tasks;
    }

    private Task convertEntityToTask(TaskEntity entity) {
        return new Task(
            entity.getId(), 
            new Title(entity.getTitle()), 
            new Description(entity.getDescription()), 
            entity.getDate(), 
            entity.getKanbanId()
        );
    }

    private TaskEntity converTaskToEntity(Task task) {
        return new TaskEntity(
            task.getId(), 
            task.getTitle(), 
            task.getDescription(), 
            task.getDate(), 
            task.getKanbanReference()
        );
    }
}
