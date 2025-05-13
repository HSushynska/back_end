package de.ait.hw15.dto;

import de.ait.hw15.model.Task;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString

public class ProgrammerResponseDto {
    @Setter
    private Long id;
    private String name;
    private Set<Task> tasks;
}
