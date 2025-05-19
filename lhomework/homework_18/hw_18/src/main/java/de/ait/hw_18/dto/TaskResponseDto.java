package de.ait.hw_18.dto;

import de.ait.hw_18.model.Priority;
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
