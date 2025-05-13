package de.ait.hw15.service;

import de.ait.hw15.dto.TaskRequestDto;
import de.ait.hw15.dto.TaskResponseDto;
import de.ait.hw15.model.Task;
import de.ait.hw15.repository.TaskRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public TaskResponseDto save(TaskRequestDto dto) {
        Task task = new Task(null, dto.getDescription(), dto.getPriority());
        return taskRepository.save(task);
    }
}
