package com.example.sf710restapi.dao;

import com.example.sf710restapi.dao.model.Contact;

import java.util.List;

public interface ContactRepository {
    List<Contact> getAll();
    Contact getById(int id);
    Contact insert(Contact contact);
    Contact update(Contact contact);
    void delete(int id);
}
