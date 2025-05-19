package de.ait.hw_18.service;

import de.ait.hw_18.dto.TaskRequestDto;
import de.ait.hw_18.dto.TaskResponseDto;
import de.ait.hw_18.mappers.TaskMapper;
import de.ait.hw_18.model.Priority;
import de.ait.hw_18.model.Task;
import de.ait.hw_18.repository.PriorityRepository;
import de.ait.hw_18.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository repository;
    private final TaskMapper mapper;
    private final PriorityRepository priorityRepository;


    @Override
    public List<TaskResponseDto> getAllTasks() {
        return mapper.toResponseDtoList(repository.findAll());
    }

    @Override
    public TaskResponseDto getTaskById(Long id) {
        return mapper.toResponseDto(repository.findById(id).get());
    }

    @Override
    public TaskResponseDto createTask(TaskRequestDto dto) {
        Task task = mapper.fromRequestDto(dto);

        Priority priority = priorityRepository
                .findById(dto.getPriority().getId())
                .orElseThrow(() -> new RuntimeException("Category not found"));
        task.setPriority(priority);
        Task savedTask = repository.save(task);
        return mapper.toResponseDto(savedTask);
    }
}



