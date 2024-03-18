package de.mid;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(JsonProperties.class)
public class Poc {
    public static void main(String[] args) {
        SpringApplication.run(new Class[] {Poc.class}, args);
    }
}