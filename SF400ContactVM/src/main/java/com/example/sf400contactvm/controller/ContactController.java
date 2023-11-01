package com.example.sf400contactvm.controller;

import com.example.sf400contactvm.service.service.impl.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContactController {
    @Autowired
    private ContactServiceImpl contactService;

    @GetMapping("/contacts")
    @ResponseBody
    public String getContacts() {

        return contactService.getContactsAsString();
    }

}
