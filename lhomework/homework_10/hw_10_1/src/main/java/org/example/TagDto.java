package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Getter
@NoArgsConstructor
@ToString


public class TagDto {
    private Map<String, Double> coordinates;
    private String data;
}
