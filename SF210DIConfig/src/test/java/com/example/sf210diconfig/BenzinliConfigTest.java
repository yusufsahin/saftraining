package com.example.sf210diconfig;

import com.example.sf210diconfig.di.Motor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("benzinli")
public class BenzinliConfigTest {
    @Autowired
    private Motor motor;

    @Test
    public void benzinliMotorTest() {
        assertEquals("Benzinli", motor.tipGetir());
    }
}
