package de.ait.tasks1.dto;

// Task {id, description (описание), priority (приоритет)}


import de.ait.tasks1.model.Priority;
import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
public class TaskRequestDto {
    private String description;
    private Priority priority;


}

