package de.ait.hw15.repository;

import de.ait.hw15.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    Task save(Task task);
    Task delete(Long id);
}
