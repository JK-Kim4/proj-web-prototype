package com.jw.webprototype;

import com.jw.webprototype.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static List<Member> members = new ArrayList<>();

    public static void main(String[] args) {

        Member member1 = new Member("test1");
        Member member2 = new Member("test2");

        members.add(member1);
        members.add(member2);

        SpringApplication.run(Application.class, args);
    }

}
