package de.ait.hw15.service;

import de.ait.hw15.dto.TaskRequestDto;
import de.ait.hw15.dto.TaskResponseDto;
import de.ait.hw15.model.Task;

import java.util.List;

public interface TaskService {
    TaskResponseDto save(TaskRequestDto dto);
}
