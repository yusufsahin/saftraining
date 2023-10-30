package com.example.sf003appcontextwithinterface.config;

import com.example.sf003appcontextwithinterface.service.impl.MyServiceImpl;
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
