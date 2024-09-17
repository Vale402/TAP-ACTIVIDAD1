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

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setclave(String clave){
        this.clave = clave;
    }


    public static Grupo[] getListaGrupos() {
        return listaGrupos;
    }

    public static void setListaGrupos(Grupo[] listaGrupos) {
        Grupo.listaGrupos = listaGrupos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Grupo.contador = contador;
    }

    public static void mostrarGrupos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaGrupos[i].getNombre() + " - " + listaGrupos[i].getClave());
        }
    }

}
