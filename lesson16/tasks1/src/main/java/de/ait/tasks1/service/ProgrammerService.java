package de.ait.tasks1.service;

import de.ait.tasks1.dto.ProgrammerRequestDto;
import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.model.Programmer;

import java.util.List;

public interface ProgrammerService {
    List<ProgrammerResponseDto> getAllProgrammer();
    ProgrammerResponseDto getProgrammerById(Long id);
    ProgrammerResponseDto createTask(ProgrammerRequestDto taskRequestDto);
    ProgrammerResponseDto deleteTask(Long id);

}
