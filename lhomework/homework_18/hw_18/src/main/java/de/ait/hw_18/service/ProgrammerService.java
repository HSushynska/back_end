package de.ait.hw_18.service;

import de.ait.hw_18.dto.ProgrammerRequestDto;
import de.ait.hw_18.dto.ProgrammerResponseDto;
import de.ait.hw_18.dto.TaskRequestDto;
import de.ait.hw_18.dto.TaskResponseDto;

import java.util.List;

public interface ProgrammerService {
    List<ProgrammerResponseDto> getAllProgrammers();
    ProgrammerResponseDto getProgrammerById(Long id);
    ProgrammerResponseDto addProgrammer(ProgrammerRequestDto dto);

}
