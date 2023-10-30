package com.example.sf400contactvm.dao;

import com.example.sf400contactvm.dao.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ContactRepository {
    List<Contact> findAll();
    Contact findById(Long id);
    void save(Contact contact);
    void deleteById(Long id);
}
