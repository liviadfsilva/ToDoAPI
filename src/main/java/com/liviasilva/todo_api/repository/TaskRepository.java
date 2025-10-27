package com.liviasilva.todo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liviasilva.todo_api.model.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByImportantAndUrgent(boolean important, boolean urgent);

}