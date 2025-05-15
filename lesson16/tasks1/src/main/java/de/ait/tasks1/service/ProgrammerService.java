package de.ait.tasks1.service;

import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.model.Programmer;

import java.util.List;

public interface ProgrammerService {
    List<ProgrammerResponseDto> getAllProgrammers();
    ProgrammerResponseDto getProgrammer(long id);
    ProgrammerResponseDto createProgrammer(Programmer programmer);



}
