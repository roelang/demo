package com.example.demo.contact;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/contacts", produces = APPLICATION_JSON_VALUE)
public class ContactEndpoint {

  @Autowired
  private ContactService contactService;

  @GetMapping()
  public List<Contact> getAllContacts(){
    return contactService.getAllContacts();
  }

  @GetMapping(value = "/{contactId}")
  public Contact getContact(@PathVariable Integer contactId){
    return contactService.getContact(contactId);
  }

}
