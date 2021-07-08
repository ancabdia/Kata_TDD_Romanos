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

    @org.junit.jupiter.api.Test
    void pasar2Aromanos() {
        String romano = numerosRomanos.naturalAromano(2);

        assertEquals(romano, "II");
    }

    @org.junit.jupiter.api.Test
    void pasar3Aromanos() {
        String romano = numerosRomanos.naturalAromano(3);

        assertEquals(romano, "III");
    }

    @org.junit.jupiter.api.Test
    void pasar4Aromanos() {
        String romano = numerosRomanos.naturalAromano(4);

        assertEquals(romano, "IV");
    }

    @org.junit.jupiter.api.Test
    void pasar5Aromanos() {
        String romano = numerosRomanos.naturalAromano(5);

        assertEquals(romano, "V");
    }

    @org.junit.jupiter.api.Test
    void pasar6Aromanos() {
        String romano = numerosRomanos.naturalAromano(6);

        assertEquals(romano, "VI");
    }
}