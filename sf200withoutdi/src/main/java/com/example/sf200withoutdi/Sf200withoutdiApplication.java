package com.example.sf200withoutdi;

import com.example.sf200withoutdi.wodi.Araba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sf200withoutdiApplication {

    public static void main(String[] args) {

        //SpringApplication.run(Sf200withoutdiApplication.class, args);

        Araba araba= new Araba();

        araba.baslat();
    }

}
