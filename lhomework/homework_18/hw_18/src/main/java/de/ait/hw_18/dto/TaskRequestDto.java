package de.ait.hw_18.dto;

import de.ait.hw_18.model.Priority;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

public class TaskRequestDto {
    private String description;
    private Priority priority; //?
}
