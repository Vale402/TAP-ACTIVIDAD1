package org.example;

public class Grupo {
    private String nombre;
    private String clave;
    public static Grupo[] listaGrupos = new Grupo[100];
    private static int contador = 0;

    public Grupo(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        agregarGrupo(this);
    }

    public static void agregarGrupo(Grupo grupo) {
        listaGrupos[contador++] = grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }


    public static void mostrarGrupos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaGrupos[i].getNombre() + " - " + listaGrupos[i].getClave());
        }
    }
}
