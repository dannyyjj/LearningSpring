package com.danny.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringApplication {
    // h2.bat 켜져있는지 확인 !!
    public static void main(String[] args) {
        SpringApplication.run(LearningSpringApplication.class, args);
    }

}
