package com.example.sf400contactvm.service.service.impl;
import com.example.sf400contactvm.dao.impl.ContactRepositoryImpl;
import com.example.sf400contactvm.dao.model.Contact;
import com.example.sf400contactvm.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepositoryImpl contactRepository;

    @Override
    public String getContactsAsString() {
        List<Contact> contacts=contactRepository.findAll();

        StringBuilder sb = new StringBuilder();

        sb.append("ID    | First Name | Last Name | Phone Number\n");
        sb.append("---------------------------------------------\n");

        for (Contact contact : contacts) {
            sb.append(contact.getId()).append(" | ")
                    .append(contact.getFirstName()).append(" | ")
                    .append(contact.getLastName()).append(" | ")
                    .append(contact.getPhoneNumber()).append("\n")
                    .append("---------------------------------------------\n");
        }

        return sb.toString();
    }
}
