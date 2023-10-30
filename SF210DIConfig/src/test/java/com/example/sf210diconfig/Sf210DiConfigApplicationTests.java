package com.example.sf210diconfig;

import com.example.sf210diconfig.di.Araba;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class Sf210DiConfigApplicationTests {
    @Autowired
    private Araba araba;

    @MockBean
    private Araba mockAraba;

    @Test
    void contextLoads() {
    }
    @Test
    void arabaBaslatIsCalled() {
        // Araba'nın baslat() metodunu çağır
        araba.baslat();

        // Mockito ile baslat() metodunun çağrılıp çağrılmadığını kontrol et
        Mockito.verify(mockAraba, Mockito.times(1)).baslat();
    }

}
