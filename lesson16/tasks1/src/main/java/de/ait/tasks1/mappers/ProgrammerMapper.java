package de.ait.tasks1.mappers;


import de.ait.tasks1.dto.ProgrammerResponseDto;
import de.ait.tasks1.dto.TaskResponseDto;
import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProgrammerMapper {
    ProgrammerResponseDto toResponseDto(Programmer programmer);
    List<ProgrammerResponseDto> toResponseDtoList(List<Programmer> programmer);
}
