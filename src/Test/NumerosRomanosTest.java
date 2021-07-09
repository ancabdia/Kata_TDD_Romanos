package Test;

import main.NumerosRomanos;

import static org.junit.jupiter.api.Assertions.*;

class NumerosRomanosTest {
    NumerosRomanos numerosRomanos = new NumerosRomanos();

    /**
     * Test random para evitar generar toda la bateria de cada caso
     * Genera numero random entre 50 y 99
     * Devuelve un sout() con el numero generado y si el test ha pasado.
     */
    @org.junit.jupiter.api.Test
    void pasarRandomEntre50Y99Aromanos() {
        int random = (int) (Math.random() * (99-50) + 50);
        String romano = numerosRomanos.naturalAromano(random);

        System.out.println("El numero aleatorio es: " + random + " ha devuelto: " + romano);
        assertEquals(romano, romano);
    }

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

    @org.junit.jupiter.api.Test
    void pasar9Aromanos() {
        String romano = numerosRomanos.naturalAromano(9);

        assertEquals(romano, "IX");
    }

    @org.junit.jupiter.api.Test
    void pasar10Aromanos() {
        String romano = numerosRomanos.naturalAromano(10);

        assertEquals(romano, "X");
    }

    @org.junit.jupiter.api.Test
    void pasar11Aromanos() {
        String romano = numerosRomanos.naturalAromano(11);

        assertEquals(romano, "XI");
    }

    @org.junit.jupiter.api.Test
    void pasar12Aromanos() {
        String romano = numerosRomanos.naturalAromano(12);

        assertEquals(romano, "XII");
    }

    @org.junit.jupiter.api.Test
    void pasar13Aromanos() {
        String romano = numerosRomanos.naturalAromano(13);

        assertEquals(romano, "XIII");
    }

    @org.junit.jupiter.api.Test
    void pasar14Aromanos() {
        String romano = numerosRomanos.naturalAromano(14);

        assertEquals(romano, "XIV");
    }

    @org.junit.jupiter.api.Test
    void pasar15Aromanos() {
        String romano = numerosRomanos.naturalAromano(15);

        assertEquals(romano, "XV");
    }

    @org.junit.jupiter.api.Test
    void pasar30Aromanos() {
        String romano = numerosRomanos.naturalAromano(30);

        assertEquals(romano, "XXX");
    }

    @org.junit.jupiter.api.Test
    void pasar34Aromanos() {
        String romano = numerosRomanos.naturalAromano(34);

        assertEquals(romano, "XXXIV");
    }

    @org.junit.jupiter.api.Test
    void pasar42Aromanos() {
        String romano = numerosRomanos.naturalAromano(42);

        assertEquals(romano, "XLII");
    }

    @org.junit.jupiter.api.Test
    void pasar50Aromanos() {
        String romano = numerosRomanos.naturalAromano(50);

        assertEquals(romano, "L");
    }

}