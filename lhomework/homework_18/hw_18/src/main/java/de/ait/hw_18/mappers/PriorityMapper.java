package de.ait.hw_18.mappers;

import de.ait.hw_18.dto.PriorityRequestDto;
import de.ait.hw_18.dto.PriorityResponseDto;
import de.ait.hw_18.model.Priority;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriorityMapper {
    Priority fromDto(PriorityRequestDto dto);
    PriorityResponseDto toDto (Priority priority);
    List<PriorityResponseDto> toDtoList (List<Priority> priority );
}
