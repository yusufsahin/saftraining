package com.example.sf700security.dao;

import com.example.sf700security.dao.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> findAll();
    Task findById(Long id);
    void save(Task task);
    void update(Task task);
    void delete(Long id);
}
