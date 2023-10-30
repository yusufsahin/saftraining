package com.example.sf200withoutdi.wodi;

public class Araba {

    private final Motor motor= new Motor();
    public void baslat() {
        System.out.println(motor.tipGetir() + " motor başlatıldı.");
    }
}
