package de.ait.hw_18.controller;

import de.ait.hw_18.dto.PriorityRequestDto;
import de.ait.hw_18.dto.PriorityResponseDto;
import de.ait.hw_18.service.PriorityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/priorities")

public class PriorityController {
    private final PriorityService service;
    @GetMapping
    public ResponseEntity<List<PriorityResponseDto>> getAll() {
        return ResponseEntity.ok().body(service.getPriorities());

    }
    @GetMapping("/{id}")
    public ResponseEntity<PriorityResponseDto> getCategoryById(@PathVariable("id") Long id){
        return ResponseEntity.ofNullable(service.getPriorityById(id));
    }

    @PostMapping
    public ResponseEntity<PriorityResponseDto> addCategory(@RequestBody PriorityRequestDto dto){
        PriorityResponseDto saved = service.save(dto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saved.getId())
                .toUri();
        return ResponseEntity.created(location).body(saved);


    }
}
