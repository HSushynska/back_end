package de.ait.tasks1.service;

import de.ait.tasks1.dto.TaskResponseDto;

import java.util.List;

public interface TaskService {
    List<TaskResponseDto> getAllTasks();
}

