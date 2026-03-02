/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Main {
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Asignatura> asignaturas = new ArrayList<>();
    private static ArrayList<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSISTEMA ACADEMICO");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante");
            System.out.println("4. Actualizar Estudiante");
            System.out.println("5. Eliminar Estudiante");
            System.out.println("6. Registrar Asignatura");
            System.out.println("7. Listar Asignaturas");
            System.out.println("8. Buscar Asignatura");
            System.out.println("9. Actualizar Asignatura");
            System.out.println("10. Eliminar Asignatura");
            System.out.println("11. Registrar Nota");
            System.out.println("12. Listar Notas");
            System.out.println("13. Buscar Nota");
            System.out.println("14. Actualizar Nota");
            System.out.println("15. Eliminar Nota");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> registrarEstudiante();
                case 2 -> listarEstudiantes();
                case 3 -> buscarEstudiante();
                case 4 -> actualizarEstudiante();
                case 5 -> eliminarEstudiante();
                case 6 -> registrarAsignatura();
                case 7 -> listarAsignaturas();
                case 8 -> buscarAsignatura();
                case 9 -> actualizarAsignatura();
                case 10 -> eliminarAsignatura();
                case 11 -> registrarNota();
                case 12 -> listarNotas();
                case 13 -> buscarNota();
                case 14 -> actualizarNota();
                case 15 -> eliminarNota();
                case 0 -> System.out.println("Saliendo del sistema");
                default -> System.out.println("Error, intente de nuevo");
            }

        } while (opcion != 0);

        sc.close();
    }
    private static void registrarEstudiante() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nRegistrar Estudiante");
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Semestre: ");
        int semestre = sc.nextInt();
        sc.nextLine(); 

        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, edad, semestre);
        estudiantes.add(estudiante);

        System.out.println("Estudiante registrado correctamente.");
    }
    
    private static void listarEstudiantes() {
        System.out.println("\nListar Estudiantes");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println(e);
            }
        }
    }

    private static void buscarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBuscar Estudiante");
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigo = sc.nextLine();

        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante encontrado: " + e);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Error, no se encontro un estudiante con el codigo ingresado");
        }
    }
    
    private static void actualizarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nActualizar Estudiante");
        System.out.print("Ingrese el codigo del estudiante a actualizar: ");
        String codigo = sc.nextLine();

        boolean encontrado = false;
        for (Estudiante e : estudiantes) {
            if (e.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Estudiante encontrado: " + e);

                System.out.print("Nuevo nombre (actual: " + e.getNombre() + "): ");
                String nombre = sc.nextLine();
                if (!nombre.isEmpty()) e.setNombre(nombre);

                System.out.print("Nuevo apellido (actual: " + e.getApellido() + "): ");
                String apellido = sc.nextLine();
                if (!apellido.isEmpty()) e.setApellido(apellido);

                System.out.print("Nueva edad (actual: " + e.getEdad() + "): ");
                String edadStr = sc.nextLine();
                if (!edadStr.isEmpty()) e.setEdad(Integer.parseInt(edadStr));

                System.out.print("Nuevo semestre (actual: " + e.getSemestre() + "): ");
                String semestreStr = sc.nextLine();
                if (!semestreStr.isEmpty()) e.setSemestre(Integer.parseInt(semestreStr));

                System.out.println("Estudiante actualizado correctamente");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Error, no se encontro un estudiante con el codigo ingresado");
        }
    }
    private static void eliminarEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEliminar Estudiante");
        System.out.print("Ingrese el codigo del estudiante a eliminar: ");
        String codigo = sc.nextLine();

        boolean eliminado = false;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                estudiantes.remove(i);
                System.out.println("Estudiante eliminado correctamente");
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("Error, no se encontro un estudiante con el codigo ingresado");
        }
    }
     public static void registrarAsignatura() {
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Creditos: ");
        int creditos = sc.nextInt();
        sc.nextLine();
        
        listaAsignaturas.add(new Asignatura(codigo, nombre, creditos));
        System.out.println("Asignatura registrada correctamente.");

     }
    public static void listarAsignaturas() {
        if (listaAsignaturas.isEmpty()) {
            System.out.println("No hay asignaturas registradas.");
            return;
        }
        for (Asignatura a : listaAsignaturas) {
            System.out.println(a);
        }
    }
     public static Asignatura buscarAsignatura(String codigo) {
        for (Asignatura a : listaAsignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                return a;
            }
        }
        return null;
    }

    public static void actualizarAsignatura() {
        System.out.print("Código de la asignatura a actualizar: ");
        String codigo = sc.nextLine();

        Asignatura a = buscarAsignatura(codigo);
        if (a == null) {
            System.out.println("Asignatura no encontrada.");
            return;
        }

        System.out.print("Nuevo nombre: ");
        a.setNombre(sc.nextLine());

        System.out.print("Nuevos créditos: ");
        a.setCreditos(sc.nextInt());
        sc.nextLine();

        System.out.println("Asignatura actualizada.");
    }

    private static void eliminarAsignatura() {}
    private static void registrarNota() {}
    private static void listarNotas() {}
    private static void buscarNota() {}
    private static void actualizarNota() {}
    private static void eliminarNota() {}
}
