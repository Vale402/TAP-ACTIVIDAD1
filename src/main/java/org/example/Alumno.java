package org.example;

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
}
