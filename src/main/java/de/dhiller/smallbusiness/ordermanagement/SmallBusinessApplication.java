package de.dhiller.smallbusiness.ordermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class SmallBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallBusinessApplication.class, args);
    }

}
