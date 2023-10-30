package com.example.sf210diconfig;

import com.example.sf210diconfig.di.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {
    @Test
    public void tipGetirTest() {
        Motor motor = new Motor("Benzinli");
        assertEquals("Benzinli", motor.tipGetir());
    }
}
