package com.example.demo.Home;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/home")
public class HomeEndpoint {
  @GetMapping(produces = APPLICATION_JSON_VALUE)
  public String home() {
    return "Spring boot is working!";
  }
}
