package org.example;
import java.util.Scanner;
public class Catedratico {
    private String nombre;
    private String id;
    public static Catedratico[] listaCatedraticos = new Catedratico[30];
    private static int contador = 0;

    public Catedratico(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        agregarCatedratico(this);
    }

    public static void agregarCatedratico(Catedratico catedratico) {
        listaCatedraticos[contador++] = catedratico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Catedratico[] getListaCatedraticos() {
        return listaCatedraticos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Catedratico.contador = contador;
    }

    public static void setListaCatedraticos(Catedratico[] listaCatedraticos) {
        Catedratico.listaCatedraticos = listaCatedraticos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public static void mostrarCatedraticos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaCatedraticos[i].getNombre() + " - " + listaCatedraticos[i].getId());
        }
    }
    public static void agregarCatedratico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del Catedrático: ");
        String nombre = scanner.nextLine();
        System.out.print("ID del Catedrático: ");
        String id = scanner.nextLine();
        Catedratico catedratico = new Catedratico(nombre, id);
        System.out.println("Catedrático agregado exitosamente.");
    }
}
