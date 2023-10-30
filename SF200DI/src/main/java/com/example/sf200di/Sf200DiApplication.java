package com.example.sf200di;

import com.example.sf200di.di.Araba;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf200DiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Sf200DiApplication.class, args);

        // Araba sınıfının bir örneği alınır.
        Araba araba = context.getBean(Araba.class);

        // Araba sınıfının baslat metodunu çağırarak "V8 motor başlatıldı." mesajını konsolda gösterir.
        araba.baslat();
    }

}
