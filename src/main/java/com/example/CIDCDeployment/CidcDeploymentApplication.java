package com.example.CIDCDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class CidcDeploymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CidcDeploymentApplication.class, args);
    }
        @GetMapping("/get")
        public String create()
        {
            return  "Welcome to the CICD pipeline" +
                    "Now CICD pipline working Successfully - Version 2";


    }
}

