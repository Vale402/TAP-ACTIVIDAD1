package org.example;

public class Alumno {
    private String nombre;
    private int noControl;

    public Alumno(String nombre, int noControl) {
        this.nombre = nombre;
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", noControl=" + noControl +
                '}';
    }
}
