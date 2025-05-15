package de.ait.tasks1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Tasks1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Tasks1Application.class, args);
        System.out.println("qwert");
    }


}
