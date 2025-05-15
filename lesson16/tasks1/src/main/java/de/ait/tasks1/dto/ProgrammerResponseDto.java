package de.ait.tasks1.dto;

import lombok.*;

import java.util.List;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class ProgrammerResponseDto {
    private Long id;
    private String name;
    private Set<TaskResponseDto> tasks;
}

