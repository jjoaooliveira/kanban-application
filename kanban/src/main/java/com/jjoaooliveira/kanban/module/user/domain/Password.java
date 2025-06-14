package com.jjoaooliveira.kanban.module.user.domain;

import com.jjoaooliveira.kanban.module.user.domain.exception.DomainException;

public class Password {
    private String value;

    public Password(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value == null || value.isEmpty()) throw new DomainException("Password cannot be null or empty");

        if (value.length() < 8) throw new DomainException("Password must be at least 8 characters long");
    }

    public String getValue() {
        return this.value;
    }
}
