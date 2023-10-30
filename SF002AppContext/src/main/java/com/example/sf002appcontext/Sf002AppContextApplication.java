package com.example.sf002appcontext;

import com.example.sf002appcontext.service.impl.MyServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf002AppContextApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Sf002AppContextApplication.class, args);
        MyServiceImpl myService= context.getBean(MyServiceImpl.class);
        myService.printMessage();
    }

}
