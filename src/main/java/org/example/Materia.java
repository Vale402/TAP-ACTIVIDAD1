package org.example;
public class Materia {
    private String nombre;
    private String clave;
    public static Materia[] listaMaterias = new Materia[100];
    private static int contador = 0;


    public Materia(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        agregarMateria(this);
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public static void setContador(int contador) {
        Materia.contador = contador;
    }

    public static void setListaMaterias(Materia[] listaMaterias) {
        Materia.listaMaterias = listaMaterias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void agregarMateria(Materia materia) {
        listaMaterias[contador++] = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public static Materia[] getListaMaterias() {
        return listaMaterias;
    }

    public static int getContador() {
        return contador;
    }

    public String getClave() {
        return clave;
    }

    public static void mostrarMaterias() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaMaterias[i].getNombre() + " - " + listaMaterias[i].getClave());
        }
    }
}