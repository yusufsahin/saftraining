package com.example.sf901jdbc.dao;

import com.example.sf901jdbc.dao.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    void delete(Long id);
    void update(User user);
}
