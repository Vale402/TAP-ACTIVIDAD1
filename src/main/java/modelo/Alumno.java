package modelo;

public class Alumno {
    private String nombre;
    private int numControl;
    String[] datosAlumno;

    public Alumno() {
        this.nombre = nombre;
        this.numControl = numControl;
    }

    public static void registrarAlumno(String[] datosAlumno) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Alumno registrado: " + String.join(", ", datosAlumno));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Numero de Control=" + numControl +
                ", Nombre='" + nombre + '\'' +
                '}';
    }
}

