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
    private static void registrarEstudiante() {}
    private static void listarEstudiantes() {}
    private static void buscarEstudiante() {}
    private static void actualizarEstudiante() {}
    private static void eliminarEstudiante() {}
    private static void registrarAsignatura() {}
    private static void listarAsignaturas() {}
    private static void buscarAsignatura() {}
    private static void actualizarAsignatura() {}
    private static void eliminarAsignatura() {}
    private static void registrarNota() {}
    private static void listarNotas() {}
    private static void buscarNota() {}
    private static void actualizarNota() {}
    private static void eliminarNota() {}
}
