package Inversiones;

public class Admin extends Usuarios {

    public Admin(int idUsuario, String nombre, String contrasena, String email) {
        super(idUsuario, nombre, contrasena, email);
    }

    public void verInversionesCliente(Cliente cliente) {
        System.out.println("Inversiones del cliente " + cliente.getNombre() + ":");
        cliente.verInversiones();
    }

    public void eliminarInversion(Cliente cliente, int index) {
        if (index >= 0 && index < cliente.getInversiones().size()) {
            cliente.getInversiones().remove(index);
            System.out.println("Inversión eliminada con éxito.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void agregarInversion(Cliente cliente, String tipo, double monto) {
        if (cliente.getCapital() >= monto) {
            cliente.invertir(tipo, monto);
            System.out.println("Inversión agregada al cliente " + cliente.getNombre() + ".");
        } else {
            System.out.println("El cliente no tiene suficiente capital para esta inversión.");
        }
    }
}