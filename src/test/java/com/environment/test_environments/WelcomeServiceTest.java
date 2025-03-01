package com.environment.test_environments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WelcomeServiceTest {

  @Autowired private WelcomeService service;

  @Test
  void getWelcome() throws InterruptedException {

    String expected = "Hello, world!";

    String actual = service.getWelcome();

    assertEquals(expected, actual);
  }
}
