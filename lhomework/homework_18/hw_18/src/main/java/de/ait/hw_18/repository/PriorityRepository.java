package de.ait.hw_18.repository;

import de.ait.hw_18.model.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PriorityRepository extends JpaRepository<Priority, Long> {
    List<Priority> findAll();
    Optional<Priority> findById(Long id);
    Priority save(Priority priority);

    Optional<Object> getPriorityById(Long id);
}
