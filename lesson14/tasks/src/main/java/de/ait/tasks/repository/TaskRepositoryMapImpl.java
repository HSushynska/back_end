package de.ait.tasks.repository;

import de.ait.tasks.model.Priority;
import de.ait.tasks.model.Task;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class TaskRepositoryMapImpl implements TaskRepository {
    private static HashMap<Long, Task> map = new HashMap<>();
    private static Long lastId = 5L;

    static {
        map.put(1L, new Task(1L, "Task1", Priority.LOW));
        map.put(2L, new Task(2L, "Task2", Priority.HIGH));
        map.put(3L, new Task(3L, "Task3", Priority.LOW));
        map.put(4L, new Task(4L, "Task4", Priority.MIDDLE));
        map.put(5L, new Task(5L, "Task5", Priority.LOW));
    }

    @Override
    public List<Task> findAll() {
        return map.values().stream().toList();
    }

    @Override
    public Task findById(Long id) {
        if (id < 1 || id > lastId) {
            throw new RuntimeException("id not found"); //IdNotFoundException
        }
        return map.get(id);
    }

    @Override
    public Task save(Task task) {
        task.setId(++lastId);
        map.put(lastId, task);
        return task;
    }

    @Override
    public Task delete(Long id) {
        return map.remove(id);
    }

    private Long getLastID(Task task) {
        return lastId + 1L;
    }


}
