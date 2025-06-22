package com.jjoaooliveira.kanban.module.task.infrastructure.database;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class TaskEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String description;
    private OffsetDateTime date;
    private Long kanbanId;

    public TaskEntity() {
    }

    public TaskEntity(Long id, String title, String description, OffsetDateTime date, Long kanbanId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.kanbanId = kanbanId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getKanbanId() {
        return kanbanId;
    }

    public void setKanbanId(Long kanbanId) {
        this.kanbanId = kanbanId;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }
}
