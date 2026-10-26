package com.example.CIDCDeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CidcDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CidcDeploymentApplication.class, args);

        String Result=show();
        System.out.println(Result);


    }


    public static String show()
    {
        String message = "Welcome to the CICD and java  is programing ++git ";
        return message;

    }

}

