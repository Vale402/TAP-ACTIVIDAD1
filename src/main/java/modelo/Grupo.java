package modelo;

public class Grupo {
    private String clave;
    private String nombre;
    String[] datosEspecialidad;

    public Grupo(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    public Grupo() {

    }

    public static void registrarGrupo(String[] datosGrupo) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Grupo registrado: " + String.join(", ", datosGrupo));
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
        return "Grupo{" +
                "Clave=" + clave +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}