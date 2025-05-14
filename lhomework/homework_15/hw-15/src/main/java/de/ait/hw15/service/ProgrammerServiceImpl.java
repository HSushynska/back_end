package de.ait.hw15.service;

import de.ait.hw15.dto.ProgrammerRequestDto;
import de.ait.hw15.dto.ProgrammerResponseDto;
import de.ait.hw15.model.Programmer;
import de.ait.hw15.model.Task;
import de.ait.hw15.repository.ProgrammerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {
private final ProgrammerRepository programmerRepository;

    @Override
    public ProgrammerResponseDto save(ProgrammerRequestDto dto) {
        Programmer programmer= new Programmer(null, dto.getName());
        Programmer saved = programmerRepository.save(programmer);
        return new ProgrammerResponseDto(saved.getId(), saved.getName(), saved.getTasks());

    }
}
