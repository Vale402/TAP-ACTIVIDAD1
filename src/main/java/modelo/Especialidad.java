package modelo;

public class Especialidad {
    private String clave;
    private String nombre;
    String[] datosEspecialidad;

    public Especialidad() {
        this.clave = clave;
        this.nombre = nombre;
    }
    public static void registrarEspecialidad(String[] datosEspecialidad) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Especialidad registrada: " + String.join(", ", datosEspecialidad));
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
        return "Especialidad{" +
                "Clave=" + clave +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}