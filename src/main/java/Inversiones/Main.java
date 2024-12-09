package Inversiones;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(1, "Administrador", "admin123", "admin@mail.com");
        Cliente cliente = new Cliente(2, "Juan Pérez", "password123", "juan@mail.com", 5000.0);

        System.out.println("Cliente registrado: " + cliente.getNombre());

        cliente.invertir("Acciones", 2000.0);
        cliente.invertir("Bonos", 1000.0);

        System.out.println("Inversiones actuales del cliente:");
        admin.verInversionesCliente(cliente);

        System.out.println("Eliminando la primera inversión...");
        admin.eliminarInversion(cliente, 0);

        System.out.println("Inversiones después de eliminar:");
        admin.verInversionesCliente(cliente);

        System.out.println("Agregando una nueva inversión...");
        admin.agregarInversion(cliente, "Criptomonedas", 500.0);

        System.out.println("Inversiones finales:");
        admin.verInversionesCliente(cliente);
    }
}
