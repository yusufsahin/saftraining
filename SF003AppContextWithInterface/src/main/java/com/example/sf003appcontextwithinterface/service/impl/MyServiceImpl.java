package com.example.sf003appcontextwithinterface.service.impl;

import com.example.sf003appcontextwithinterface.service.MyService;

public class MyServiceImpl implements MyService
{
    @Override
    public void printMessage() {
        System.out.println("Merhaba, Spring Boot!");

    }
}
