package main;

public class NumerosRomanos {

    public String naturalAromano(int numeroNatural){

        switch (numeroNatural){
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
        }
        return null;
    }
}