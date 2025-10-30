package com.liviasilva.todo_api.Task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liviasilva.todo_api.Task.model.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByImportantAndUrgent(boolean important, boolean urgent);

}