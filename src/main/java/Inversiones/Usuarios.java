package Inversiones;

public class Usuarios {
    private int IdUsuario;
    private String nombre,contrasena,email;

    //metodos

    public String invertir(){
        return "El usuario puede invertir";
    }
    public String verInversion(){
        return "ver inversiones";
    }

    public Usuarios(int idUsuario, String nombre, String contrasena, String email) {
        IdUsuario = idUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
    }

    //aqui puse el get y set
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
