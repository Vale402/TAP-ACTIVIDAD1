public class Especialidad {
    private String nombre;
    private String clave;
    public static Especialidad[] listaEspecialidades = new Especialidad[100];
    private static int contador = 0;

    public Especialidad(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        agregarEspecialidad(this);
    }

    public static void agregarEspecialidad(Especialidad especialidad) {
        listaEspecialidades[contador++] = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public static void mostrarEspecialidades() {
        for (int i = 0; i < contador; i++) {
            System.out.println(listaEspecialidades[i].getNombre() + " - " + listaEspecialidades[i].getClave());
        }
    }
}
