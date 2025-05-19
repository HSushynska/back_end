package de.ait.hw_18.service;

import de.ait.hw_18.dto.ProgrammerRequestDto;
import de.ait.hw_18.dto.ProgrammerResponseDto;
import de.ait.hw_18.mappers.ProgrammerMapper;
import de.ait.hw_18.model.Programmer;
import de.ait.hw_18.repository.ProgrammerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService {
    private final ProgrammerRepository programmerRepository;
    private final ProgrammerMapper mapper;

    @Override
    public List<ProgrammerResponseDto> getAllProgrammers() {
        return mapper.toDtoList(programmerRepository.findAll());
    }

    @Override
    public ProgrammerResponseDto getProgrammerById(Long id) {
        Programmer programmer = programmerRepository.findById(id).get();
        if(programmer!=null){
            return mapper.toDto(programmer);
        } else {
            throw new RuntimeException("Programmer not found");
        }
    }

    @Override
    public ProgrammerResponseDto addProgrammer(ProgrammerRequestDto dto) {
        Programmer programmer = mapper.fromDto(dto);
        Programmer savedProgrammer = programmerRepository.save(programmer);
        if(savedProgrammer!=null){
            return mapper.toDto(savedProgrammer);
        } else {
            throw  new RuntimeException("Error create new programmer");
        }
    }
}
