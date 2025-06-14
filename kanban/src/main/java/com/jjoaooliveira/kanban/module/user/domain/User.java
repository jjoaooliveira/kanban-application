package com.jjoaooliveira.kanban.module.user.domain;

public class User {
    private Long id;
    private Name name;
    private Email email;
    private Password password;
    
    public User(Long id, Name name, Email email, Password password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name.toString();
    }

    public String getEmail() {
        return email.toString();
    }

    public String getPassword() {
        return password.toString();
    }
}
