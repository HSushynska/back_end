package de.ait.tasks1.repository;

import de.ait.tasks1.model.Programmer;
import de.ait.tasks1.model.Task;

import java.util.List;

public class ProgrammerRepositoryListImpl implements ProgrammerRepository{
    @Override
    public List<Programmer> findAll() {
        return List.of();
    }

    @Override
    public Programmer findById(Long id) {
        return null;
    }

    @Override
    public Programmer save(Programmer programmer) {
        return null;
    }

    @Override
    public void addTaskToProgrammer(Long programmerId, Long taskId) {

    }

    @Override
    public void deleteTaskToProgrammer(Long programmerId, Long taskId) {

    }

    @Override
    public List<Task> findTasksByProgrammerId(Long id) {
        return List.of();
    }
}
