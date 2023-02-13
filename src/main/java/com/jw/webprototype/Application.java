package com.jw.webprototype;

import com.jw.webprototype.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private static Member member1 = new Member("tester1");
    private static Member member2 = new Member("tester2");

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
