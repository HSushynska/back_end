package de.ait.hw15.repository;

import de.ait.hw15.model.Programmer;
import de.ait.hw15.model.Task;

import java.util.List;

public interface ProgrammerRepository { List<Programmer> findAll();
    Programmer findById(Long id);
    Programmer save(Programmer programmer);
    void addTaskToProgrammer(Long programmerId, Long taskId);
    void deleteTaskByProgrammer(Long programmerId, Long taskId);
    List<Task> findTasksByProgrammerId(Long id);

}
