package com.liviasilva.todo_api.Task.controller;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liviasilva.todo_api.Task.model.Task;
import com.liviasilva.todo_api.Task.service.TaskService;
import com.liviasilva.todo_api.User.model.User;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return service.getTaskById(id)
        .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @PostMapping
    public Task createTask(@RequestBody Task task, @AuthenticationPrincipal User user) {
        task.setUser(user);
        return service.createTask(task);
}

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return service.updateTask(id, task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }

    // Eisenhower filters
    @GetMapping("/important-urgent")
    public List<Task> getImportantAndUrgent() {
        return service.getImportantAndUrgentTasks();
    }

    @GetMapping("/important-not-urgent")
    public List<Task> getImportantButNotUrgent() {
        return service.getImportantButNotUrgentTasks();
    }

    @GetMapping("/not-important-urgent")
    public List<Task> getNotImportantButUrgent() {
        return service.getNotImportantButUrgentTasks();
    }

    @GetMapping("/not-important-not-urgent")
    public List<Task> getNotImportantAndNotUrgent() {
        return service.getNotImportantAndNotUrgentTasks();
    }
}
