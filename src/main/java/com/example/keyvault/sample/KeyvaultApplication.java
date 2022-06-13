package com.example.keyvault.sample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
@RestController
@Slf4j
public class KeyvaultApplication {

    private int a;

    public static void main(String[] args) {
        SpringApplication.run(KeyvaultApplication.class, args);
    }

    @GetMapping("get")
    public String get() {
        a++;
        log.info("identity++++lombok.....{}", a);
        log.info("identity++++999lombok.....{}", connectionString);
        System.out.println("7777777777777777777777" + connectionString);
        return connectionString;
    }

    @Value("${connectionString}")
    private String connectionString;

    public void run(String... varl) throws Exception {
        System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n", connectionString));
    }

}
