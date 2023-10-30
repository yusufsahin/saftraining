package com.example.sf210diconfig;

import com.example.sf210diconfig.di.Araba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf210DiConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Sf210DiConfigApplication.class, args);
        Araba araba = context.getBean(Araba.class);
        araba.baslat();
    }

}
