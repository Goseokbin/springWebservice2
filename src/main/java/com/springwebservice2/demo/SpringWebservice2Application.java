package com.springwebservice2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class SpringWebservice2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebservice2Application.class, args);
    }

}
