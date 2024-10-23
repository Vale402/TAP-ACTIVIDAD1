package modelo;

public class Materia {
    private String clave;
    private String nombre;
    String[] datosEspecialidad;

    public Materia() {
        this.clave = clave;
        this.nombre = nombre;
    }
    public static void registrarMateria(String[] datosMateria) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Materia registrado: " + String.join(", ", datosMateria));
    }
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "Clave=" + clave +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}
