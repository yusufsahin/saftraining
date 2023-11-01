package com.example.sf902datajdbc.dao.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("contacts")
public class Contact {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
}
