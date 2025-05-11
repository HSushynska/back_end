package de.ait.hw_13.repository;

import de.ait.hw_13.model.Task;

import java.util.HashMap;
import java.util.List;

public class TaskDB implements TaskRepository {
    private static HashMap<Long, Task> map = new HashMap<>();

    static {
        map.put(1L, new Task(1L, "найти", 1));
        map.put(2L, new Task(2L, "заказать", 2));
        map.put(3L, new Task(3L, "оплатить", 3));
        map.put(4L, new Task(4L, "забрать", 4));
        map.put(5L, new Task(5L, "распаковать", 5));
        map.put(6L, new Task(6L, "установить", 6));

    }

    public List<Task> findAll() {
        return map.values().stream().toList();
    }

    public Task findById(Long id) {
        return map.get(id);
    }

    public Task save(Task task) {
        map.put(task.getId(), task);
        return task;
    }

    public Task deleteById(Long id) {
        return map.remove(id);
    }
}

