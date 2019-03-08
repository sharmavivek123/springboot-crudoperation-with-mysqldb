package io.javabrains.springbootstarter;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class CourseApiApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class,args);


    }
}
