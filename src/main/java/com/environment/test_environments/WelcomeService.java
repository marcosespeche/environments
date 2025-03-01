package com.environment.test_environments;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
@Slf4j
public class WelcomeService {

  private static final Logger log = LoggerFactory.getLogger(WelcomeService.class);
  @Value("${environment.name}")
  private String environmentName;

  public String getWelcome() throws InterruptedException {

    log.info("Loading... \n");
    Thread.sleep(3000);

    log.info("ENVIRONMENT NAME: {}", environmentName);

    return "Hello, world!";
  }
}
