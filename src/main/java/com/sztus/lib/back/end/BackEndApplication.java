package com.sztus.lib.back.end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Austin
 */
@SpringBootApplication
public class BackEndApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BackEndApplication.class);
        springApplication.run(args);
    }
}
