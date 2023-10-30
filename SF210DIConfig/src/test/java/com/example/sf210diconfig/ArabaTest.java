package com.example.sf210diconfig;

import com.example.sf210diconfig.di.Araba;
import com.example.sf210diconfig.di.Motor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArabaTest {
    @Test
    public void baslatTest() {
        Motor mockMotor = new Motor("Benzinli");
        Araba araba = new Araba(mockMotor);

        // Assert işlemi için biraz daha karmaşık bir yapı kullanmanız gerekebilir, örneğin Mockito kullanarak.
        // Şimdilik basit bir test oluşturduk.
        assertNotNull(araba);
    }
}
