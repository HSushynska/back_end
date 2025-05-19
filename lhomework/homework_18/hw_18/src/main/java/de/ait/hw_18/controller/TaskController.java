package de.ait.hw_18.controller;

import de.ait.hw_18.dto.TaskRequestDto;
import de.ait.hw_18.dto.TaskResponseDto;
import de.ait.hw_18.repository.TaskRepository;
import de.ait.hw_18.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    @GetMapping
    public ResponseEntity<List<TaskResponseDto>> getTasks(){
        return ResponseEntity.ok(service.getAllTasks());
    }

    // если ok то 200OK и TaskResponseDto   иначе  404NotFound
    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDto> getTaskById(@PathVariable("id") Long taskId){
        TaskResponseDto taskById = service.getTaskById(taskId);
        //return (taskById!=null)? ResponseEntity.ok(taskById) : ResponseEntity.notFound().build();

        return ResponseEntity.ofNullable(taskById);
    }

    @PostMapping
    public ResponseEntity<TaskResponseDto> createNewTask(@RequestBody TaskRequestDto task){
        TaskResponseDto savedTask = service.createTask(task);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedTask.getId())
                .toUri();
        return ResponseEntity.created(location).body(savedTask);

    }


}
