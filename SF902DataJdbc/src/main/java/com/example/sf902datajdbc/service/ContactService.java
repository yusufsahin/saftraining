package com.example.sf902datajdbc.service;

import com.example.sf902datajdbc.dao.model.Contact;
import com.example.sf902datajdbc.dto.ContactDto;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<ContactDto> getAllContacts();
    Optional<ContactDto> getContactById(Long id);
    ContactDto saveContact(ContactDto contactDto);

    ContactDto updateContact(ContactDto contactDto);

    void deleteContact(Long id);

}
