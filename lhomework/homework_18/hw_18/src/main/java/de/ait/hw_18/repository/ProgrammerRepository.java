package de.ait.hw_18.repository;

import de.ait.hw_18.model.Programmer;
import de.ait.hw_18.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProgrammerRepository extends JpaRepository<Programmer,Long> {
    List<Programmer> findAll();
    Optional <Programmer> findById(Long id);
    Programmer save(Programmer programmer);

}
