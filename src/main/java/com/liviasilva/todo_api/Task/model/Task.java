package com.liviasilva.todo_api.Task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String title;

    @Column
    private String description;

    @Column(name = "is_important", nullable = false)
    private Boolean important;

    @Column(name = "is_urgent", nullable = false)
    private Boolean urgent;

    @Column
    private boolean completed;

    public Task () {}

    public Task(String title, String description, Boolean important, Boolean urgent, Boolean completed) {
        this.title = title;
        this.description = description;
        this.important = important;
        this.urgent = urgent;
        this.completed = completed;

    }

    public Long getId() { return id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean getImportant() { return important; }
    public void setImportant(Boolean important) { this.important = important; }

    public boolean getUrgent() { return urgent; }
    public void setUrgent(Boolean urgent) { this.urgent = urgent; }

    public boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }

}
