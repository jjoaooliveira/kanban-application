package com.jjoaooliveira.kanban.module.task.application;

import java.util.Set;
import java.util.stream.Collectors;

import com.jjoaooliveira.kanban.module.task.domain.Task;

public class ReadTaskByKanban {
    private final TaskDataGateway dataGateway;

    public ReadTaskByKanban(TaskDataGateway dataGateway) {
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
