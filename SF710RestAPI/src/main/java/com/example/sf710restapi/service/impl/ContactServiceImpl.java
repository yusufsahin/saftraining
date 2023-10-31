package com.example.sf710restapi.service.impl;

import com.example.sf710restapi.dao.impl.ContactRepositoryImpl;
import com.example.sf710restapi.dao.model.Contact;
import com.example.sf710restapi.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl  implements ContactService {
    private final ContactRepositoryImpl repository;

    public ContactServiceImpl(ContactRepositoryImpl repository) {
        this.repository = repository;
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository.getAll();
    }

    @Override
    public Contact getContactById(int id) {
        return repository.getById(id);
    }

    @Override
    public Contact addContact(Contact contact) {
        return repository.insert(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return repository.update(contact);
    }

    @Override
    public void deleteContact(int id) {
        repository.delete(id);
    }
}
