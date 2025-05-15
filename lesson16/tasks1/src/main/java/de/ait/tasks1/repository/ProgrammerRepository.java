package de.ait.tasks1.repository;

import de.ait.tasks1.model.Priority;
import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProgrammerRepository {
    List<Programmer> findAll();
    Programmer findById(Long id);
    Programmer save(Programmer programmer);

    void addTaskToProgrammer(Long programmerId, Long taskId);
    void deleteTaskToProgrammer(Long programmerId, Long taskId);
    List<Task> findTasksByProgrammerId(Long id);

}

