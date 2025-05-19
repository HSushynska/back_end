package de.ait.hw_18.service;

import de.ait.hw_18.dto.PriorityRequestDto;
import de.ait.hw_18.dto.PriorityResponseDto;
import de.ait.hw_18.model.Priority;

import java.util.List;

public interface PriorityService {
    List<PriorityResponseDto> getPriorities();
    PriorityResponseDto getPriorityById(Long id);
    PriorityResponseDto save(PriorityRequestDto dto);
}
