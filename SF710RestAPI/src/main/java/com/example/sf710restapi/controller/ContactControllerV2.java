package com.example.sf710restapi.controller;
import com.example.sf710restapi.dao.model.Contact;
import com.example.sf710restapi.service.impl.ContactServiceImpl;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v2/contacts")
public class ContactControllerV2 {

    private final ContactServiceImpl service;

    public ContactControllerV2(ContactServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<EntityModel<Contact>> getAllContacts() {
        return service.getAllContacts().stream()
                .map(contact -> EntityModel.of(
                        contact,
                        linkTo(methodOn(ContactControllerV2.class).getContactById(contact.getId())).withSelfRel(),
                        linkTo(methodOn(ContactControllerV2.class).getAllContacts()).withRel("contacts")
                ))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EntityModel<Contact> getContactById(@PathVariable int id) {
        Contact contact = service.getContactById(id);
        Link selfLink = linkTo(methodOn(ContactControllerV2.class).getContactById(id)).withSelfRel();
        return EntityModel.of(contact, selfLink);
    }

    @PostMapping
    public EntityModel<Contact> addContact(@RequestBody Contact contact) {
        Contact newContact = service.addContact(contact);
        return EntityModel.of(
                newContact,
                linkTo(methodOn(ContactControllerV2.class).getContactById(newContact.getId())).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<Contact> updateContact(@RequestBody Contact contact) {
        Contact updatedContact = service.updateContact(contact);
        return EntityModel.of(
                updatedContact,
                linkTo(methodOn(ContactControllerV2.class).getContactById(updatedContact.getId())).withSelfRel()
        );
    }

    @PatchMapping("/{id}")
    public EntityModel<Contact> partialUpdateContact(@PathVariable int id, @RequestBody Contact contact) {
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
            Contact updatedContact = service.updateContact(existingContact);
            return EntityModel.of(
                    updatedContact,
                    linkTo(methodOn(ContactControllerV2.class).getContactById(updatedContact.getId())).withSelfRel()
            );
        }
        return null;

    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable int id) {
        service.deleteContact(id);
    }

}