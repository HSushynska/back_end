package de.ait.tasks1.dto;

// Task {id, description (описание), priority (приоритет)}


import de.ait.tasks1.model.Priority;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of="id")
public class TaskResponseDto {
    private Long id;
    private String description;
    private Priority priority;
}

