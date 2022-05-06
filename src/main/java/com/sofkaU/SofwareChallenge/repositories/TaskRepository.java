package com.sofkaU.SofwareChallenge.repositories;

import com.sofkaU.SofwareChallenge.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
