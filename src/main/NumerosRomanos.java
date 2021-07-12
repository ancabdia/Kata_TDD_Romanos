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

        if (decena <= 3) return sumar(1, decena, "", "X");

        if (decena <= 8) return sumar(6, decena, "L", "X");


        return null;
    }

    private String pasarUnidad(int unidad) {
        switch (unidad){
            case 4: return "IV";
            case 9: return "IX";
        }

        if (unidad <= 3) return sumar(1, unidad, "", "I");

        if (unidad <= 8) return sumar(6, unidad, "V", "I");


        return null;
    }

    private String sumar(int inicio, int numeroNatural, String numeroRomano, String incRomano) {
        for (int i = inicio; i <= numeroNatural; i++) {
            numeroRomano+= incRomano;
        }
        return numeroRomano;
    }
}