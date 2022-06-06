package com.project.ourbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OurbookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(OurbookstoreApplication.class, args);
    }

}
