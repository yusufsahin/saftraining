package com.example.sf320integrationtest.dao;

import com.example.sf320integrationtest.dao.model.Contact;

import java.util.Optional;

public interface ContactRepository {
    Contact save(Contact contact);
    Optional<Contact> findById(Long id);
    Optional<Contact> findByFirstName(String firstName);
}
