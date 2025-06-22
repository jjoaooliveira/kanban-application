package com.jjoaooliveira.kanban.module.task.application.member;

import java.util.Set;
import java.util.stream.Collectors;

import com.jjoaooliveira.kanban.module.task.application.TaskDataGatewayInterface;
import com.jjoaooliveira.kanban.module.task.application.TaskRequest;
import com.jjoaooliveira.kanban.module.task.application.TaskResponse;
import com.jjoaooliveira.kanban.module.task.domain.Task;

public class ReadTaskByKanban {
    private final TaskDataGatewayInterface dataGateway;

    public ReadTaskByKanban(TaskDataGatewayInterface dataGateway) {
        this.dataGateway = dataGateway;
    }

    public Set<TaskResponse> doRead(TaskRequest request) {
        Set<Task> taskSet = dataGateway.readTasksByKanbanId(request.kanbanId());
        return taskSet
            .stream()
            .map(TaskResponse::fromEntity)
            .collect(Collectors.toSet());
    }
}
