package de.ait.tasks1.service;

import de.ait.tasks1.dto.TaskRequestDto;
import de.ait.tasks1.dto.TaskResponseDto;

import java.util.List;

public interface TaskService {
    List<TaskResponseDto> getAllTasks();
    TaskResponseDto getTaskById(Long id);
    TaskResponseDto createTask(TaskRequestDto taskRequestDto);
    TaskResponseDto deleteTask(Long id);
}
