package com.example.sf902datajdbc.dao;

import com.example.sf902datajdbc.dao.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Long> {
}
