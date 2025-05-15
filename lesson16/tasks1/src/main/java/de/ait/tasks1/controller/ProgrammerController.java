package de.ait.tasks1.controller;

import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;
import de.ait.tasks1.repository.ProgrammerRepository;
import de.ait.tasks1.repository.ProgrammerRepositoryMapImpl;
import de.ait.tasks1.service.ProgrammerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@AllArgsConstructor
public class ProgrammerController {

    private final ProgrammerRepository repository;
    private final ProgrammerService service;


    @GetMapping("/programmers")
    public List<ProgrammerResponseDto> getProgrammers() {
        return service.getAllProgrammer();
    }

    @GetMapping("/programmers/{id}")
    public Programmer getProgrammerById(@PathVariable("id") Long id) {
        return repository.findById(id);
    }
}