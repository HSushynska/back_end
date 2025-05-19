package de.ait.hw_18.mappers;

import de.ait.hw_18.dto.TaskRequestDto;
import de.ait.hw_18.dto.TaskResponseDto;
import de.ait.hw_18.model.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskResponseDto toResponseDto(Task task);
    List<TaskResponseDto> toResponseDtoList(List<Task> task);
    Task fromRequestDto(TaskRequestDto dto);
}
