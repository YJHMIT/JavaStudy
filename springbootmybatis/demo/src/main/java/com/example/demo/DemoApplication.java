package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ForkJoinWorkerThread;

@SpringBootApplication
public class DemoApplication {

    private static ForkJoinWorkerThread SpringApplication;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
