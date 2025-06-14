package com.jjoaooliveira.kanban.module.user.domain;

import com.jjoaooliveira.kanban.module.user.domain.exception.DomainException;

public class Name {
    private String value;

    public Name(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value == null || value.isBlank()) {
            throw new DomainException("Name cannot be null or blank");
        }
    }

    public String getValue() {
        return this.value;
    }
}
