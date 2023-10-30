package com.example.sf210diconfig.di;

import org.springframework.stereotype.Component;

@Component
public class Araba {
    private final Motor motor;

    public Araba(Motor motor) {
        this.motor = motor;
    }

    public void baslat() {
        System.out.println(motor.tipGetir() + " motor başlatıldı.");
    }
}
