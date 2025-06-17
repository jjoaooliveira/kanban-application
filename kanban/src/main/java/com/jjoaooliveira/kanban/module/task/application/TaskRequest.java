package com.jjoaooliveira.kanban.module.task.application;

import java.time.OffsetDateTime;

public record TaskRequest(Long id, String title, String description, OffsetDateTime date, Long kanbanId) {
    
}
