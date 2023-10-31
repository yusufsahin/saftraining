package com.example.sf710restapi.controller;
import com.example.sf710restapi.dao.model.Contact;
import com.example.sf710restapi.service.impl.ContactServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    private final ContactServiceImpl service;

    public ContactController(ContactServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return service.getAllContacts();
    }

    @GetMapping("/{id}")
    public Contact getContactById(@PathVariable int id) {
        return service.getContactById(id);
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }

    @PutMapping
    public Contact updateContact(@RequestBody Contact contact) {
        return service.updateContact(contact);
    }

    @PatchMapping("/{id}")
    public Contact partialUpdateContact(@PathVariable int id, @RequestBody Contact contact) {
        Contact existingContact = service.getContactById(id);
        if (existingContact != null) {
            if (contact.getFirstName() != null) {
                existingContact.setFirstName(contact.getFirstName());
            }
            if (contact.getLastName() != null) {
                existingContact.setLastName(contact.getLastName());
            }
            if (contact.getPhoneNumber() != null) {
                existingContact.setPhoneNumber(contact.getPhoneNumber());
            }
            return service.updateContact(existingContact);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable int id) {
        service.deleteContact(id);
    }
}
