package com.example.sf400contactvm;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.sf400contactvm.dao.impl.ContactRepositoryImpl;
import com.example.sf400contactvm.dao.model.Contact;
import com.example.sf400contactvm.service.service.impl.ContactServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

class ContactServiceImplTest {

    @InjectMocks
    ContactServiceImpl contactService;

    @Mock
    ContactRepositoryImpl contactRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetContactsAsString() {
        when(contactRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Contact(1L, "John", "Doe", "123-456-7890"),
                        new Contact(2L, "Jane", "Smith", "987-654-3210")
                )
        );

        String result = contactService.getContactsAsString();
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Doe"));
        assertTrue(result.contains("Jane"));
        assertTrue(result.contains("Smith"));
    }
}
