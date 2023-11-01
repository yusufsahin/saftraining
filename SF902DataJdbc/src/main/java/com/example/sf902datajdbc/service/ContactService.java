package com.example.sf902datajdbc.service;

import com.example.sf902datajdbc.dao.model.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<Contact> getAllContacts();
    Optional<Contact> getContactById(Long id);
    Contact saveContact(Contact contact);
    Contact updateUser(Contact contact);
    void deleteContact(Long id);

}
