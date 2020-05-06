package com.sunlife.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class Application9000 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application9000.class, args);
    }
}
