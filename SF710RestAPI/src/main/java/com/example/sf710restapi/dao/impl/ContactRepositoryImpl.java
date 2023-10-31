package com.example.sf710restapi.dao.impl;

import com.example.sf710restapi.dao.ContactRepository;
import com.example.sf710restapi.dao.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
    private final List<Contact> contacts = new ArrayList<>();
    private final AtomicInteger idGenerator = new AtomicInteger(0);
    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public Contact getById(int id) {
        return contacts.stream()
                .filter(contact -> contact.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Contact insert(Contact contact) {
        int newId = idGenerator.incrementAndGet();
        contact.setId(newId);
        contacts.add(contact);
        return contact;
    }

    @Override
    public Contact update(Contact contact) {
        int index = contacts.indexOf(getById(contact.getId()));
        if (index >= 0) {
            contacts.set(index, contact);
            return contact;
        }
        return null;
    }

    @Override
    public void delete(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }
}
