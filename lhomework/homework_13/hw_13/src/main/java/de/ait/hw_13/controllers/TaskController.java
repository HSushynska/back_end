package de.ait.hw_13.controllers;

import de.ait.hw_13.model.Task;
import de.ait.hw_13.repository.TaskDB;
import de.ait.hw_13.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TaskController {
    TaskRepository repository = new TaskDB();

    @GetMapping("/tasks")
    public List<Task> getTask() {
        return repository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Task getById(@PathVariable(name = "id") Long taskId) {
        return repository.findById(taskId);
    }

    @PostMapping("/tasks")
    public Task addTask(@RequestBody Task task) {
        return repository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public Task deleteTask(@PathVariable(name = "id") Long taskId) {
        return repository.deleteById(taskId);
    }
}

