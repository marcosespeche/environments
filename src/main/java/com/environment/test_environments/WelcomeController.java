package com.environment.test_environments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {

  @Autowired private WelcomeService service;

  @GetMapping(path = "")
  public ResponseEntity<String> getWelcome() throws InterruptedException {

    String response = service.getWelcome();

    return ResponseEntity.ok(response);
  }
}
