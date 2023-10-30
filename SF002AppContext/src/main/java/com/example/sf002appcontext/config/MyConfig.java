package com.example.sf002appcontext.config;

import com.example.sf002appcontext.service.impl.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyServiceImpl myServiceImpl()
    {
        return new MyServiceImpl();
    }
}
