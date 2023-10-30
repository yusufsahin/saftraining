package com.example.sf003appcontextwithinterface;

import com.example.sf003appcontextwithinterface.service.impl.MyServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf003AppContextWithInterfaceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Sf003AppContextWithInterfaceApplication.class, args);
        MyServiceImpl myService= context.getBean(MyServiceImpl.class);
        myService.printMessage();
    }

}
