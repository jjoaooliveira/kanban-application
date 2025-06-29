package com.jjoaooliveira.kanban.module.kanbanboard.application.adapter;

import java.util.List;

import com.jjoaooliveira.kanban.module.kanbanboard.application.TaskDTO;

public interface TaskAdapter {
    List<TaskDTO> queryTasks(Long boardId); 
}
