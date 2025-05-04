package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor

public class ResultDto {
    private List<TagDto> text;
}
