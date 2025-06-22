package com.jjoaooliveira.kanban.module.task.application.admin;

import com.jjoaooliveira.kanban.module.task.application.TaskDataGatewayInterface;
import com.jjoaooliveira.kanban.module.task.application.TaskRequest;
import com.jjoaooliveira.kanban.module.task.application.TaskResponse;
import com.jjoaooliveira.kanban.module.task.domain.Description;
import com.jjoaooliveira.kanban.module.task.domain.Task;
import com.jjoaooliveira.kanban.module.task.domain.Title;

public class CreateTask {
    private final TaskDataGatewayInterface dataGateway;

    public CreateTask(TaskDataGatewayInterface dataGateway) {
        this.dataGateway = dataGateway;
    }

    public TaskResponse doCreate(TaskRequest request) {
        Title title = new Title(request.title());
        Description description = new Description(request.description());
        Task task = new Task(request.id(), 
                            title,
                            description, 
                            request.date(), 
                            request.kanbanId());

        Task persistedTask = dataGateway.saveTask(task);
        return TaskResponse.fromEntity(persistedTask);
    }
}
