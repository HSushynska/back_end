package de.ait.hw_18.mappers;

import de.ait.hw_18.dto.ProgrammerRequestDto;
import de.ait.hw_18.dto.ProgrammerResponseDto;
import de.ait.hw_18.model.Programmer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammerMapper {
    Programmer fromDto(ProgrammerRequestDto dto);
    ProgrammerResponseDto toDto (Programmer programmer);
    List<ProgrammerResponseDto> toDtoList (List<Programmer> user);
}
