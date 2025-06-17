package com.jjoaooliveira.kanban.module.task.domain;

import java.time.OffsetDateTime;

public class Task {
    private final Long id;
    private Title title;
    private Description description;
    private final OffsetDateTime date;
    private final Long kanbanId;

    public Task(Long id, Title title, Description description, OffsetDateTime date, Long kanbanId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.kanbanId = kanbanId;
    }

    public Long getId() {
        return id;
    }

    public void updateTitle(String title) {
        this.title = new Title(title);
    }

    public String getTitle() {
        return title.getContent();
    }
    
    public String getDescription() {
        return description.getContent();
    }
    
    public void updateDescription(String description) {
        this.description = new Description(description);
    }

    public Long getKanbanReference() {
        return kanbanId;
    }

    public OffsetDateTime getDate() {
        return date;
    }
}
