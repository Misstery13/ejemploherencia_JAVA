package Modelo;

public class Profesor extends Persona {
        private float sueldo;

        public Profesor(String cedula, String nombres, String apellidos, String telefono, float sueldo) {
            super(cedula, nombres, apellidos, telefono);
            this.sueldo = sueldo;
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

