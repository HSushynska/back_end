package de.ait.tasks1.service;

import de.ait.tasks1.dto.ProgrammerRequestDto;
import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.mappers.ProgrammerMapper;
import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;
import de.ait.tasks1.repository.ProgrammerRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ProgrammerServiceImpl implements ProgrammerService {
    private final ProgrammerRepository repository;
    private final ProgrammerMapper mapper;

    @Override
    public List<ProgrammerResponseDto> getAllProgrammer() {
        return mapper.toResponseDtoList(repository.findAll());
    }

    @Override
    public ProgrammerResponseDto getProgrammerById(Long id) {
        return null;
    }

    @Override
    public ProgrammerResponseDto createTask(ProgrammerRequestDto taskRequestDto) {
        return null;
    }

    @Override
    public ProgrammerResponseDto deleteTask(Long id) {
        return null;
    }
}
