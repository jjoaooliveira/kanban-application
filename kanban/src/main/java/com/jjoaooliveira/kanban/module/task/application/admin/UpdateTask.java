package com.jjoaooliveira.kanban.module.task.application.admin;

import com.jjoaooliveira.kanban.module.task.application.TaskDataGateway;
import com.jjoaooliveira.kanban.module.task.application.TaskRequest;
import com.jjoaooliveira.kanban.module.task.application.TaskResponse;
import com.jjoaooliveira.kanban.module.task.domain.Description;
import com.jjoaooliveira.kanban.module.task.domain.Task;
import com.jjoaooliveira.kanban.module.task.domain.Title;

public class UpdateTask {
    private final TaskDataGateway dataGateway;

    public UpdateTask(TaskDataGateway dataGateway) {
        this.dataGateway = dataGateway;
    }

    public TaskResponse doUpdate(TaskRequest request) {
        Title title = new Title(request.title());
        Description description = new Description(request.description());
        Task task = new Task(request.id(), 
                            title,
                            description, 
                            request.date(), 
                            request.kanbanId());

        Task persistedTask = dataGateway.updateTask(task);
        return TaskResponse.fromEntity(persistedTask);
    }
}
