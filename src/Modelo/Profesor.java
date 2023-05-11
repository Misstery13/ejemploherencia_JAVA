package Modelo;

public class Profesor extends Persona {
        private float sueldo;

        public Profesor(String cedula, String nombres, String apellidos, String telefono, float sueldo) {
            super(cedula, nombres, apellidos, telefono);
            this.sueldo = sueldo;
        }

        public void mostrarProfesor() {
            System.out.println("CEDULA: "+getCedula());
            System.out.println("NOMBRES: "+getNombres());
            System.out.println("APELLIDOS: "+getApellidos());
            System.out.println("TELEFONO: "+getTelefono());
            System.out.println("SUELDO: "+getSueldo());
            caminar();
            hablar();
            enseniar();
        }

        public float getSueldo() {
            return sueldo;
        }

        public void setSueldo(float sueldo) {
            this.sueldo = sueldo;
        }
        public void enseniar() {
            System.out.println("Profesor: enseñar desde la clase profesor");
        }

    }

