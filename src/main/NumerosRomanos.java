package main;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private final static List<String> simbolosRomanos = Arrays.asList("I","V","X","L","C");

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
            case 4: return simbolosRomanos.get(2) + simbolosRomanos.get(3);
            case 9: return simbolosRomanos.get(2) + simbolosRomanos.get(4);
        }

        if (decena <= 3) return sumar(1, decena, "", simbolosRomanos.get(2));

        if (decena <= 8) return sumar(6, decena, simbolosRomanos.get(3), simbolosRomanos.get(2));


        return null;
    }

    private String pasarUnidad(int unidad) {
        switch (unidad){
            case 4: return simbolosRomanos.get(0) + simbolosRomanos.get(1);
            case 9: return simbolosRomanos.get(0) + simbolosRomanos.get(2);
        }

        if (unidad <= 3) return sumar(1, unidad, "", simbolosRomanos.get(0));

        if (unidad <= 8) return sumar(6, unidad, simbolosRomanos.get(1), simbolosRomanos.get(0));


        return null;
    }

    private String sumar(int inicio, int numeroNatural, String numeroRomano, String incRomano) {
        for (int i = inicio; i <= numeroNatural; i++) {
            numeroRomano+= incRomano;
        }
        return numeroRomano;
    }
}