package de.ait.hw15.controller;

import de.ait.hw15.dto.TaskRequestDto;
import de.ait.hw15.dto.TaskResponseDto;
import de.ait.hw15.model.Task;
import de.ait.hw15.repository.TaskRepository;
import de.ait.hw15.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController

public class TaskController {
    private final TaskRepository repository;
    private final TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return repository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable("id") Long taskId){
        return repository.findById(taskId);
    }

    @PostMapping("/tasks")
    public TaskResponseDto createNewTask(@RequestBody TaskRequestDto task){
        return taskService.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public  Task deleteTaskById(@PathVariable("id") Long id){
        return repository.delete(id);
    }

}
