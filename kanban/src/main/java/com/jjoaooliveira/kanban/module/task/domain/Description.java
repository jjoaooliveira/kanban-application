package com.jjoaooliveira.kanban.module.task.domain;

import com.jjoaooliveira.kanban.module.task.domain.exception.TaskDomainException;

public class Description {
    private final String content;

    public Description(String content) {
        validate(content);
        this.content = content;
    }

    private void validate(String content) {
        if(content == null || content.isBlank()) throw new TaskDomainException("Description cannot be blank or null");
    }

    public String getContent() {
        return content;
    }
}
