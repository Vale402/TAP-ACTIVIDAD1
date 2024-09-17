package org.example;
import java.util.Scanner;
public class Especialidad {
    private String nombre;
    private String clave;
    public static Especialidad[] listaEspecialidades = new Especialidad[100];
    private static int contador = 0;

    public Especialidad(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        agregarEspecialidad(this);
    }

    public static void agregarEspecialidad(Especialidad especialidad) {
        listaEspecialidades[contador++] = especialidad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }
    public void setclave(String clave){
        this.clave = clave;
    }

    public static Especialidad[] getListaEspecialidades() {
        return listaEspecialidades;
    }

    public static void setListaEspecialidades(Especialidad[] listaEspecialidades) {
        Especialidad.listaEspecialidades = listaEspecialidades;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Especialidad.contador = contador;
    }

    public static void mostrarEspecialidades() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaEspecialidades[i].getNombre() + " - " + listaEspecialidades[i].getClave());
        }
    }

    public static void agregarEspecialidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de la Especialidad: ");
        String nombre = scanner.nextLine();
        System.out.print("Clave de la Especialidad: ");
        String clave = scanner.nextLine();
        Especialidad especialidad = new Especialidad(nombre, clave);
        System.out.println("Especialidad agregada exitosamente.");
    }
}
