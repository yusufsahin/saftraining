package com.example.sf400contactvm;
import static org.junit.jupiter.api.Assertions.*;

import com.example.sf400contactvm.dao.impl.ContactRepositoryImpl;
import com.example.sf400contactvm.dao.model.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class ContactRepositoryImplTest {

    private ContactRepositoryImpl contactRepository;

    @BeforeEach
    void setUp() {
        contactRepository = new ContactRepositoryImpl();
    }

    @Test
    void testFindAll() {
        Contact contact1 = new Contact(1L, "John", "Doe", "123-456-7890");
        Contact contact2 = new Contact(2L, "Jane", "Smith", "987-654-3210");

        contactRepository.save(contact1);
        contactRepository.save(contact2);

        List<Contact> contacts = contactRepository.findAll();
        assertEquals(2, contacts.size());
    }

    @Test
    void testFindById() {
        Contact contact = new Contact(1L, "John", "Doe", "123-456-7890");
        contactRepository.save(contact);

        Contact found = contactRepository.findById(1L);
        assertEquals("John", found.getFirstName());
    }

    @Test
    void testSave() {
        Contact contact = new Contact(1L, "John", "Doe", "123-456-7890");
        contactRepository.save(contact);

        Contact found = contactRepository.findById(1L);
        assertEquals("John", found.getFirstName());
    }

    @Test
    void testDeleteById() {
        Contact contact = new Contact(1L, "John", "Doe", "123-456-7890");
        contactRepository.save(contact);

        contactRepository.deleteById(1L);

        Contact found = contactRepository.findById(1L);
        assertNull(found);
    }
}
