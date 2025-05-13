package de.ait.hw15.model;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@ToString
@AllArgsConstructor


public class Programmer {
    @Setter
    private Long id;
    private String name;
    private Set<Task> tasks;

    public Programmer(Long id, String name) {
        this.id = id;
        this.name = name;
        this.tasks = new HashSet<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }
    public void removeTask(Task task){
        tasks.remove(task);
    }

}

