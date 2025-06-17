package com.jjoaooliveira.kanban.module.task.domain;

import com.jjoaooliveira.kanban.module.task.domain.exception.TaskDomainException;

public class Title {
    private final String content;

    public Title(String content) {
        validate(content);
        this.content = content;
    }

    private void validate(String content) {
        if(content == null || content.isBlank()) throw new TaskDomainException("Title cannot be null or blank");
    }

    public String getContent() {
        return this.content;
    }
}
