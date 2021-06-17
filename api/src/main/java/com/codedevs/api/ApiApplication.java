package com.codedevs.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.codedevs.api",
        "com.codedevs.core",
        "com.codedevs.mongorepository",
        "com.codedevs.security",
        "com.codedevs.smtpmail"
})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
