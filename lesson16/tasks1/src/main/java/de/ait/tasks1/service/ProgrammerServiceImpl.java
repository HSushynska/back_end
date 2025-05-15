package de.ait.tasks1.service;

import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.mappers.ProgrammerMapper;
import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;
import de.ait.tasks1.repository.ProgrammerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProgrammerServiceImpl implements ProgrammerService {
    private final ProgrammerRepository programmerRepository;
    private final ProgrammerMapper programmerMapper;


    @Override
    public List<ProgrammerResponseDto> getAllProgrammers() {
        return programmerMapper.toResponseDtoList(programmerRepository.findAll());
    }

    @Override
    public ProgrammerResponseDto getProgrammer(long id) {
        return null;
    }

    @Override
    public ProgrammerResponseDto createProgrammer(Programmer programmer) {
        return null;
    }

    private static ProgrammerResponseDto getProgrammerResponseDto(Programmer p)
    {
        return new ProgrammerResponseDto(p.getId(), p.getName(), p.getTasks());
    }


}
