package com.jw.webprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static Long userIdSeq;

    public static void main(String[] args) {

        userIdSeq = 1L;

        SpringApplication.run(Application.class, args);
    }

}
