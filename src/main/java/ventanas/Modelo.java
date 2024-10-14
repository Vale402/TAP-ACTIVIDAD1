package ventanas;
public class Modelo {
    // Datos simulados
    public String[] materias = {"Tópicos Avanzados - Senen Tinoco Juarez", "Métodos Numéricos - Brenda Fernández", "Fund Ing Software - Almeida González Santiago"};
    public String[] especialidades = {"Ing en Sistemas", "Ing Industrial", "Ing Mecatrónica", "Ing Química"};

    public void registrarAlumno(String[] datosAlumno) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Alumno registrado: " + String.join(", ", datosAlumno));
    }

    public void registrarCatedratico(String[] datosCatedratico) {
        // Aquí se pueden agregar los datos a una base de datos o arreglo
        System.out.println("Catedrático registrado: " + String.join(", ", datosCatedratico));
    }

    public String[] obtenerMaterias() {
        return materias;
    }

    public String[] obtenerEspecialidades() {
        return especialidades;
    }
}
