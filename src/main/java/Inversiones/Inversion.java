package Inversiones;

public class Inversion {

    private String fondosDeinversion;
    private double valor;


    public Inversion(String fondosDeinversion, double valor) {
        this.fondosDeinversion = fondosDeinversion;
        this.valor = valor;
    }

    public String getFondosDeinversion() {
        return fondosDeinversion;
    }

    public double getValor() {
        return valor;
    }
}


