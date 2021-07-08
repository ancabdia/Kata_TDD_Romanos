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

    @org.junit.jupiter.api.Test
    void pasar7Aromanos() {
        String romano = numerosRomanos.naturalAromano(7);

        assertEquals(romano, "VII");
    }

    @org.junit.jupiter.api.Test
    void pasar8Aromanos() {
        String romano = numerosRomanos.naturalAromano(8);

        assertEquals(romano, "VIII");
    }

//    @org.junit.jupiter.api.Test
//    void pasar9Aromanos() {
//        String romano = numerosRomanos.naturalAromano(9);
//
//        assertEquals(romano, "IX");
//    }
//
//    @org.junit.jupiter.api.Test
//    void pasar10Aromanos() {
//        String romano = numerosRomanos.naturalAromano(10);
//
//        assertEquals(romano, "X");
//    }
}