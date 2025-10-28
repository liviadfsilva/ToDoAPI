package com.liviasilva.todo_api.Task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.liviasilva.todo_api.Task.model.Task;
import com.liviasilva.todo_api.Task.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return repository.findById(id);
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }
    
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }

    public List<Task> getImportantAndUrgentTasks() {
        return repository.findByImportantAndUrgent(true, true);
    }

    public List<Task> getImportantButNotUrgentTasks() {
        return repository.findByImportantAndUrgent(true, false);
    }

    public List<Task> getNotImportantAndUrgentTasks() {
        return repository.findByImportantAndUrgent(false, true);
    }

    public List<Task> getNotImportantAndNotUrgentTasks() {
        return repository.findByImportantAndUrgent(false, false);
    }
    
}