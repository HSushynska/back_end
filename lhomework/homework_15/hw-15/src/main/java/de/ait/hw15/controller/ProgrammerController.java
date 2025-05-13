package de.ait.hw15.controller;

import de.ait.hw15.dto.ProgrammerRequestDto;
import de.ait.hw15.dto.ProgrammerResponseDto;
import de.ait.hw15.dto.TaskRequestDto;
import de.ait.hw15.dto.TaskResponseDto;
import de.ait.hw15.model.Programmer;
import de.ait.hw15.model.Task;
import de.ait.hw15.repository.ProgrammerRepository;
import de.ait.hw15.service.ProgrammerService;
import de.ait.hw15.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ProgrammerController {

    private final ProgrammerRepository repository;
    private final ProgrammerService programmerService;

    @GetMapping("/programmers")
    public List<Programmer> getProgrammers(){
        return repository.findAll();
    }

    @GetMapping("/programmers/{id}")
    public Programmer getProgrammerById(@PathVariable("id") Long id){
        return repository.findById(id);
    }


    //получить список задач заданного программиста (GET programmers/id/tasks)
    @GetMapping("/programmers/{id}/tasks")
    public List<Task> getTaskByProgrammer(@PathVariable("id") Long id){
        return repository.findTasksByProgrammerId(id);
    }

    //поручить программисту задачу (PUT programmers/programmerId/tasks/taskId)
    @PutMapping("/programmers/{programmerId}/tasks/{taskId}")
    public void addTaskToProgrammer(@PathVariable("programmerId") Long programmerID,
                                    @PathVariable("taskId") Long taskId){
        repository.addTaskToProgrammer(programmerID,taskId);
    }

    @PostMapping("/programmers")
    public ProgrammerResponseDto createNewProgrammer(@RequestBody ProgrammerRequestDto programmer){
        return programmerService.save(programmer);

    }

}

