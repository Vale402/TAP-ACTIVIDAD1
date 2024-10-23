package modelo;

public class Catedratico {
    private String rfc;
    private String nombre;
    String[] datosEspecialidad;

    public Catedratico() {
        this.rfc = this.rfc;
        this.nombre = nombre;
    }
    public static void registrarCatedratico(String[] datosCatedratico) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Catedrático registrado: " + String.join(", ", datosCatedratico));
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Catedratico{" +
                "Clave=" + rfc +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}

