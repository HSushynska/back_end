package de.ait.hw_18.service;

import de.ait.hw_18.dto.PriorityRequestDto;
import de.ait.hw_18.dto.PriorityResponseDto;
import de.ait.hw_18.mappers.PriorityMapper;
import de.ait.hw_18.model.Priority;
import de.ait.hw_18.repository.PriorityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PriorityServiceImpl implements PriorityService {
    private  final PriorityRepository repository;
    private final PriorityMapper mapper;

    @Override
    public List<PriorityResponseDto> getPriorities() {

        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public PriorityResponseDto getPriorityById(Long id) {
        return mapper.toDto(repository.findById(id).orElse(null));
    }

    @Override
    public PriorityResponseDto save(PriorityRequestDto dto) {
        Priority priority = mapper.fromDto(dto);
        Priority savedPriority = repository.save(priority);
        return mapper.toDto(savedPriority);
    }
}
