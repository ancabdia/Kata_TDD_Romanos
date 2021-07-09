package main;

public class NumerosRomanos {

    public String naturalAromano(Integer numeroNatural){

        char[] numerosChar = numeroNatural.toString().toCharArray(); //almacenar en []

        if(numerosChar.length >= 2){ //separar unidades mayor a 1
            String unidadRomana =  pasarUnidad(Integer.parseInt(String.valueOf(numerosChar[1])));
            String decenaRomana = pasarDecena(Integer.parseInt(String.valueOf(numerosChar[0])));

            return decenaRomana+unidadRomana;
        }else{
            return pasarUnidad(Integer.parseInt(String.valueOf(numerosChar[0])));
        }
    }

    private String pasarDecena(int decena) {
        switch (decena){
            case 4: return "XL";
            case 9: return "XC";
        }

        if (decena <= 3) return sumarX(1, decena, "");

        if (decena <= 8) return sumarX(6, decena, "L");


        return null;
    }

    private String pasarUnidad(int unidad) {
        switch (unidad){
            case 4: return "IV";
            case 9: return "IX";
        }

        if (unidad <= 3) return sumarI(1, unidad, "");

        if (unidad <= 8) return sumarI(6, unidad, "V");


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

    private String sumarX(int inicio, int numeroNatural, String numeroRomano) {
        for (int i = inicio; i <= numeroNatural; i++) {
            numeroRomano+="X";
        }
        return numeroRomano;
    }
}