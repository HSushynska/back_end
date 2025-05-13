package de.ait.hw15.service;

import de.ait.hw15.dto.ProgrammerRequestDto;
import de.ait.hw15.dto.ProgrammerResponseDto;
import de.ait.hw15.model.Programmer;

import java.util.List;

public interface ProgrammerService {
    ProgrammerResponseDto save(ProgrammerRequestDto dto);
}
