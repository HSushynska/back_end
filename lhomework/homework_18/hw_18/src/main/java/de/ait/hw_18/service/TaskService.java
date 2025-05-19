package de.ait.hw_18.service;

import de.ait.hw_18.dto.TaskRequestDto;
import de.ait.hw_18.dto.TaskResponseDto;

import java.util.List;

public interface TaskService {
    List<TaskResponseDto> getAllTasks();
    TaskResponseDto getTaskById(Long id);
    TaskResponseDto createTask (TaskRequestDto dto);

}
