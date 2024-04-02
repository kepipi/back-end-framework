package com.sztus.lib.back.end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.util.TimeZone;

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
