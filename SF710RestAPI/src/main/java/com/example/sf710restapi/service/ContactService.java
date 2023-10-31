package com.example.sf710restapi.service;

import com.example.sf710restapi.dao.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> getAllContacts();
    Contact getContactById(int id);
    Contact addContact(Contact contact);
    Contact updateContact(Contact contact);
    void deleteContact(int id);
}
