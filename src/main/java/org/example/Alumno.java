package org.example;

import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String matricula;
    public static Alumno[] listaAlumnos = new Alumno[100];
    private static int contador = 0;

    public Alumno(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        agregarAlumno(this);
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void setListaAlumnos(Alumno[] listaAlumnos) {
        Alumno.listaAlumnos = listaAlumnos;
    }

    public static void setContador(int contador) {
        Alumno.contador = contador;
    }

    public static void agregarAlumno(Alumno alumno) {
        listaAlumnos[contador++] = alumno;
    }

      public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public static void mostrarAlumnos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaAlumnos[i].getNombre() + " - " + listaAlumnos[i].getMatricula());
        }
    }
    public static void agregarAlumno() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del Alumno: ");
        String nombre = scanner.nextLine();
        System.out.print("Matrícula del Alumno: ");
        String matricula = scanner.nextLine();
        Alumno alumno = new Alumno(nombre, matricula);
        System.out.println("Alumno agregado exitosamente.");
    }
}
