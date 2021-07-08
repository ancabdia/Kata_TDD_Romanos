package main;

public class NumerosRomanos {

    public String naturalAromano(int numeroNatural){

        if (numeroNatural <= 3) return sumarI(numeroNatural);

        switch (numeroNatural){
            case 4: return "IV";
            case 5: return "V";
        }
        return null;
    }

    /**
     * Simplificar casos bases, concatenando hasta los 3 primeros "I"
     * @param numeroNatural entero natural a transformar
     * @return numero romano
     */
    private String sumarI(int numeroNatural) {
        String resultado = "";
        for (int i = 1; i <= numeroNatural; i++) {
            resultado+="I";
        }
        return resultado;
    }
}