package com.environment.test_environments;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class WelcomeService {

    @Value("${environment.name}")
    private String environmentName;

 public String getWelcome() throws InterruptedException{

     System.out.println("Loading... \n");
     Thread.sleep(3000);

     System.out.println(environmentName);

     return "Hello, world!";
 }

}
