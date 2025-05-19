package de.ait.hw_18.controller;

import de.ait.hw_18.dto.ProgrammerRequestDto;
import de.ait.hw_18.dto.ProgrammerResponseDto;
import de.ait.hw_18.service.ProgrammerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor

public class ProgrammerController {
    private final ProgrammerService service;

    @GetMapping("/programmers")
    public List<ProgrammerResponseDto> getProgrammers() {
        return service.getAllProgrammers();
    }

    @GetMapping("programmers/{id}")
    public ProgrammerResponseDto getProgrammerById(@PathVariable("id") Long id) {
        return service.getProgrammerById(id);
    }

    @PostMapping("/programmers")
    public ProgrammerResponseDto saveProgrammer (@RequestBody ProgrammerRequestDto dto){
        return service.addProgrammer(dto);

    }
}
