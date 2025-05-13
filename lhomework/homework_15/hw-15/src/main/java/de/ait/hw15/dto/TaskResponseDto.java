package de.ait.hw15.dto;

import de.ait.hw15.model.Priority;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class TaskResponseDto {
    @Setter
    private Long id;
    private String description;
    private Priority priority;
}
