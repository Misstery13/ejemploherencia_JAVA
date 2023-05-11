package Modelo;

public class Estudiante extends Persona {
    private int numMaterias;

    public Estudiante(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public Estudiante(String cedula, String nombres, String apellidos, String telefono, int numMaterias) {
        super(cedula, nombres, apellidos, telefono);
        this.numMaterias = numMaterias;
    }

    public void mostrarEstudiante() {
        System.out.println("CEDULA: "+getCedula());
        System.out.println("NOMBRES: "+getNombres());
        System.out.println("APELLIDOS: "+getApellidos());
        System.out.println("TELEFONO: "+getTelefono());
        System.out.println("NUM MATERIAS: "+getNumMaterias());
        caminar();
        hablar();
        aprender();
    }
    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public void aprender() {
        System.out.println("Estudiante: estoy aprendiendo desde la clase estudiante");
    }

}
