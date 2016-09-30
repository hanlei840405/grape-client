package com.fruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("distributed-id-generator-client-provider.xml")
public class GrapeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrapeClientApplication.class, args);
    }
}
