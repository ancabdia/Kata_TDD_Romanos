package Test;

import main.NumerosRomanos;

import static org.junit.jupiter.api.Assertions.*;

class NumerosRomanosTest {
    NumerosRomanos numerosRomanos = new NumerosRomanos();

    @org.junit.jupiter.api.Test
    void pasar1Aromanos() {
        String romano = numerosRomanos.naturalAromano(1);

        assertEquals(romano, "I");
    }
}