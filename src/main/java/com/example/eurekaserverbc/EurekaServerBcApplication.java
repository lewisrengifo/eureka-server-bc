package com.example.eurekaserverbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBcApplication.class, args);
    }

}
