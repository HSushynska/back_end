package de.ait.tasks1.service;

import de.ait.tasks1.dto.TaskRequestDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.mappers.TaskMapper;
import de.ait.tasks1.model.Task;
import de.ait.tasks1.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository repository;
    private final TaskMapper mapper;

    @Override
    // return или значение TaskResponseDto или null
    public List<TaskResponseDto> getAllTasks() {
        return mapper.toResponseDtoList(repository.findAll());
    }

    @Override
    public TaskResponseDto getTaskById(Long id) {
        return mapper.toResponseDto(repository.findById(id));
    }

    @Override
    public TaskResponseDto createTask(TaskRequestDto taskDto) {
        Task task = mapper.fromRequestDto(taskDto);
        Task savedTask = repository.save(task);
        return mapper.toResponseDto(savedTask);
    }

    @Override
    public TaskResponseDto deleteTask(Long id) {
        return mapper.toResponseDto(repository.delete(id));
    }

}

