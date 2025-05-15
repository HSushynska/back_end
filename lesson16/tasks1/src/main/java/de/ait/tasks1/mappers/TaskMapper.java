package de.ait.tasks1.mappers;

import de.ait.tasks1.dto.TaskRequestDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.model.Task;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponseDto toResponseDto(Task task);
    List<TaskResponseDto> toResponseDtoList(List<Task> task);
    Task fromRequestDto(TaskRequestDto dto);

}

