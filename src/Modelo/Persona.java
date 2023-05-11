package Modelo;

public class Persona {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Persona() {
    }

    public Persona(String cedula, String nombres, String apellidos, String telefono) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public void mostrarPersona() {
        System.out.println("CEDULA: "+cedula);
        System.out.println("NOMBRES: "+nombres);
        System.out.println("APELLIDOS: "+apellidos);
        System.out.println("TELEFONO: "+telefono);
        caminar();
        hablar();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void caminar() {
        System.out.println("Caminar: desde la clase Persona");
    }

    public void hablar() {
        System.out.println("Hablar: desde la clase Persona");
    }
}
