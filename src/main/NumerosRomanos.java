package main;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private final static List<String> simbolosRomanos = Arrays.asList("I","V","X","L","C");

    public String naturalAromano(Integer numeroNatural){

        char[] numerosChar = numeroNatural.toString().toCharArray(); //almacenar en []

        if(numerosChar.length >= 2){ //separar unidades mayor a 1
            String unidadRomana =  pasarUnidades(Integer.parseInt(String.valueOf(numerosChar[1])), 0, 1, 2);
            String decenaRomana = pasarUnidades(Integer.parseInt(String.valueOf(numerosChar[0])), 2, 3 ,4);

            return decenaRomana+unidadRomana;
        }else{
            return pasarUnidades(Integer.parseInt(String.valueOf(numerosChar[0])),0, 1,2);
        }
    }

    private String pasarUnidades(int decena, int x, int y, int z) {
        switch (decena){
            case 4: return simbolosRomanos.get(x) + simbolosRomanos.get(y);
            case 9: return simbolosRomanos.get(x) + simbolosRomanos.get(z);
        }

        if (decena <= 3) return sumar(1, decena, "", simbolosRomanos.get(x));

        if (decena <= 8) return sumar(6, decena, simbolosRomanos.get(y), simbolosRomanos.get(x));

        return null;
    }

    private String sumar(int inicio, int numeroNatural, String numeroRomano, String incRomano) {
        for (int i = inicio; i <= numeroNatural; i++) {
            numeroRomano+= incRomano;
        }
        return numeroRomano;
    }
}