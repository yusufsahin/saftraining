package com.example.sf400contactvm.dao.impl;

import com.example.sf400contactvm.dao.ContactRepository;
import com.example.sf400contactvm.dao.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ContactRepositoryImpl implements ContactRepository {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> findAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public Contact findById(Long id) {
        return contacts.stream().filter(contact -> contact.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void save(Contact contact) {
        // Önce mevcut bir iletişim olup olmadığını kontrol edin
        Contact existingContact = findById(contact.getId());
        if (existingContact == null) {
            // Yeni bir iletişimse listeye ekle
            contacts.add(contact);
        } else {
            // Mevcut bir iletişimse güncelle
            existingContact.setFirstName(contact.getFirstName());
            existingContact.setLastName(contact.getLastName());
            existingContact.setPhoneNumber(contact.getPhoneNumber());
        }
    }

    @Override
    public void deleteById(Long id) {
        contacts.removeIf(contact -> contact.getId().equals(id));
    }
}
