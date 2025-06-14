package com.jjoaooliveira.kanban.module.user.domain;

import com.jjoaooliveira.kanban.module.user.domain.exception.DomainException;

public class Email {
    private String value;

    public Email() {}

    public Email(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value == null || value.isBlank()) {
            throw new DomainException("Email cannot be null or blank");
        }

        if(!value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new DomainException("Invalid email format");
        }
    }

    public String getValue() {
        return value;
    }
}
