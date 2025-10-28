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
    private boolean important;

    @Column(name = "is_urgent", nullable = false)
    private boolean urgent;

    @Column
    private boolean completed;

    public Task () {}

    public Task(String title, String description, boolean important, boolean urgent, boolean completed) {
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
    public void setImportant(boolean important) { this.important = important; }

    public boolean getUrgent() { return urgent; }
    public void setUrgent(boolean urgent) { this.urgent = urgent; }

    public boolean getCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

}
