package com.config.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class VehiclesConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehiclesConfigServerApplication.class, args);
    }

}
