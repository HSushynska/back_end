package de.ait.hw_18.repository;

import de.ait.hw_18.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findAll();
    Optional <Task> findById(Long id);
    Task save(Task task);
}
