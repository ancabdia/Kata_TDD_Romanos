package main;

public class NumerosRomanos {

    public String naturalAromano(int numeroNatural){
        switch (numeroNatural){
            case 4: return "IV";
            case 9: return "IX";
        }

        if (numeroNatural <= 3) return sumarI(1, numeroNatural, "");

        if (numeroNatural <= 8) return sumarI(6, numeroNatural, "V");

        return null;
    }

    /**
     * Refactor para sumar "I" a partir de valores inferiores superiores
     * @param inicio valor desde donde comenzar
     * @param numeroNatural valor a alcanzar
     * @param numeroRomano resultado en romano donde concatenar
     * @return numeroRomano
     */
    private String sumarI(int inicio, int numeroNatural, String numeroRomano) {
        for (int i = inicio; i <= numeroNatural; i++) {
            numeroRomano+="I";
        }
        return numeroRomano;
    }
}