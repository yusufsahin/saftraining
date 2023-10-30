package com.example.sf400contactvm.data;

import com.example.sf400contactvm.dao.ContactRepository;
import com.example.sf400contactvm.dao.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)

public class CreateContacts implements CommandLineRunner {
    private final ContactRepository contactRepository;

    @Autowired
    public CreateContacts(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact(1L, "John", "Doe", "123-456-7890"));
        contactRepository.save(new Contact(2L, "Jane", "Smith", "987-654-3210"));
    }
}
