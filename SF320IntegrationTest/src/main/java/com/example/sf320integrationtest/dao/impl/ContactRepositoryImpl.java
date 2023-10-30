package com.example.sf320integrationtest.dao.impl;

import com.example.sf320integrationtest.dao.ContactRepository;
import com.example.sf320integrationtest.dao.model.Contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContactRepositoryImpl implements ContactRepository {
    private Map<Long, Contact> contactsDb = new HashMap<>();
    private Long idCounter = 1L;

    @Override
    public Contact save(Contact contact) {
        if (contact.getId() == null) {
            contact.setId(idCounter++);
        }
        contactsDb.put(contact.getId(), contact);
        return contact;
    }

    @Override
    public Optional<Contact> findById(Long id) {
        return Optional.ofNullable(contactsDb.get(id));
    }

    @Override
    public Optional<Contact> findByFirstName(String firstName) {
        return contactsDb.values().stream()
                .filter(contact -> contact.getFirstName().equals(firstName))
                .findFirst();
    }

}
