package org.example;

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
}