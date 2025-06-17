package com.jjoaooliveira.kanban.module.task.domain.exception;

public class TaskDomainException extends RuntimeException {
    public TaskDomainException(String message) {
        super(message);
    }

    public TaskDomainException(String message, Throwable cause) {
        super(message, cause);
    }


    public TaskDomainException(Throwable cause) {
        super(cause);
    }
}
