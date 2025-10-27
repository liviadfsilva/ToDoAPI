package com.liviasilva.todo_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.Id;

@Entity
public class Task {
    
    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String description;
    private boolean important;
    private boolean urgent;
    private boolean completed;

    public Task () {}

    public Task(String title, String description, boolean completed, boolean important, boolean urgent) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.important = important;
        this.urgent = urgent;

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
