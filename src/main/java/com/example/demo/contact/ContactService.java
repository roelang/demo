package com.example.demo.contact;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

  @Autowired
  private ContactRepository contactRepository;

  public List<Contact> getAllContacts(){
    return contactRepository.findAll();
  }

  public Contact getContact(Integer contactId) {
    return contactRepository.findById(contactId)
        .orElseThrow(() -> new RuntimeException(HttpStatus.BAD_REQUEST.toString()));
  }
}
