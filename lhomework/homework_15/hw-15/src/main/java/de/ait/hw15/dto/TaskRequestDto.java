package de.ait.hw15.dto;

import de.ait.hw15.model.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter

public class TaskRequestDto {
    private String description;
    private Priority priority;
}
