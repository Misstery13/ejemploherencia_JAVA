import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public static ArrayList<Persona> listapersonas = new ArrayList<>();
    public static ArrayList<Estudiante> listaestudiantes = new ArrayList<>();
    public static ArrayList<Profesor> listaprofesores = new ArrayList<>();
    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            fun_operaciones(op);
            System.out.println("Desea realizar otra operación:SI(1) ");
            op = scan.nextInt();
        } while (op == 1);

    }
    public static int menu() {
        int respuesta;
        do {
            System.out.println("----------MENÚ----------");
            System.out.println("1: Registrar persona");
            System.out.println("2: Listar personas");
            System.out.println("3: Registrar estudiante");
            System.out.println("4: Listar estudiantes");
            System.out.println("5: Registrar profesor");
            System.out.println("6: Listar profesores");
            System.out.println("Elija la operacion: ");
            respuesta = scan.nextInt();
        } while (respuesta < 1 || respuesta > 6);
        return respuesta;
    }

    public static void fun_operaciones(int op) {
        String ced,nom,ape,fono;
        switch (op) {
            case 1: {
                System.out.println("---REGISTRE UNA PERSONA---");
                scan.nextLine();
                System.out.println("Ingrese la cédula: ");
                //objP.setCedula(scan.nextLine());
                ced= scan.nextLine();
                System.out.println("Ingrese los nombres: ");
                nom= scan.nextLine();
                System.out.println("Ingrese los apellidos: ");
                ape= scan.nextLine();
                System.out.println("Ingrese el telefono: ");
                fono= scan.nextLine();
                Persona objP = new Persona(ced,nom,ape,fono);
                listapersonas.add(objP);
                System.out.println(" ");
                break;
            }
            case 2: {
                System.out.println("DATOS DE LA PERSONA");
                listar_personas();
                break;
            }
            case 3: {
                System.out.println("---REGISTRE UN ESTUDIANTE---");
                scan.nextLine();
                System.out.println("Ingrese la cédula: ");
                ced= scan.nextLine();
                System.out.println("Ingrese los nombres: ");
                nom= scan.nextLine();
                System.out.println("Ingrese los apellidos: ");
                ape= scan.nextLine();
                System.out.println("Ingrese el telefono: ");
                fono= scan.nextLine();
                int numM;
                System.out.println("Ingrese el numero de materias: ");
                numM = scan.nextInt();
                Estudiante objE = new Estudiante(ced,nom,ape,fono,numM);
                listaestudiantes.add(objE);

                System.out.println(" ");
                break;
            }
            case 4: {
                System.out.println("DATOS DEL ESTUDIANTE");
                listar_estudiantes();
                break;
            }
            case 5: {
                System.out.println("---REGISTRE UN PROFESOR---");
                scan.nextLine();
                System.out.println("Ingrese la cédula: ");
                ced= scan.nextLine();
                System.out.println("Ingrese los nombres: ");
                nom= scan.nextLine();
                System.out.println("Ingrese los apellidos: ");
                ape= scan.nextLine();
                System.out.println("Ingrese el telefono: ");
                fono= scan.nextLine();
                float sueldo;
                System.out.println("Ingrese el sueldo: ");
                sueldo = scan.nextFloat();
                Profesor objPr = new Profesor(ced,nom,ape,fono,sueldo);
                listaprofesores.add(objPr);
                break;
            }
            case 6: {
                System.out.println("DATOS DEL PROFESOR");
                listar_profesores();
                break;
            }
        }
    }

    public static void listar_personas() {
        for (int i = 0; i < listapersonas.size(); i++) {
            listapersonas.get(i).mostrarPersona();
            System.out.println(" ");
        }
    }

    public static void listar_estudiantes() {
        for (int i = 0; i < listaestudiantes.size(); i++) {
            listaestudiantes.get(i).mostrarEstudiante();
            System.out.println(" ");
        }
    }

    public static void listar_profesores() {
        for (int i = 0; i < listaprofesores.size(); i++) {
            listaprofesores.get(i).mostrarProfesor();
            System.out.println(" ");
        }
    }
}

//Crear menu para elegir entre los 3 objetos
// Almacenar dentro de un array list
