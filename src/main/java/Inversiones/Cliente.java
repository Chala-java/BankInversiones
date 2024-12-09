package Inversiones;

import java.util.ArrayList;

public class Cliente extends Usuarios {

    private double capital;
    private ArrayList<Inversion> inversiones; // Cambiado a "inversiones" para mayor consistencia

    public Cliente(int idUsuario, String nombre, String contrasena, String email, double capital) {
        super(idUsuario, nombre, contrasena, email);
        this.capital = capital;
        this.inversiones = new ArrayList<>(); // Inicializamos la lista
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void invertir(String tipo, double monto) {
        if (capital >= monto) {
            capital -= monto;
            inversiones.add(new Inversion(tipo, monto)); // Usamos el atributo "inversiones"
            System.out.println("Inversión realizada: " + tipo + " por " + monto);
        } else {
            System.out.println("Capital insuficiente para realizar la inversión.");
        }
    }

    public void verInversiones() {
        if (inversiones.isEmpty()) { // Verificamos si la lista está vacía
            System.out.println("No hay inversiones realizadas.");
        } else {
            System.out.println("Inversiones realizadas:");
            for (Inversion inversion : inversiones) { // Recorremos correctamente la lista
                System.out.println("- " + inversion.getFondosDeinversion() + ": " + inversion.getValor());
            }
        }
    }

    public ArrayList<Inversion> getInversiones() {
        return inversiones;
    }
}
