import modelo.Alumno;
import modelo.Catedratico;
import modelo.Especialidad;
import modelo.Materia;
import modelo.Grupo;
import vista.Vista;
import controlador.ControladorAlumno;
import controlador.ControladorCatedratico;
import controlador.ControladorEspecialidad;
import controlador.ControladorMateria;
import controlador.ControladorGrupo;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la vista
        Vista vista = new Vista();

        // Instancias del modelo
        Alumno alumnoModelo = new Alumno();
        Catedratico catedraticoModelo = new Catedratico();
        Especialidad especialidadModelo = new Especialidad();
        Materia materiaModelo = new Materia();
        Grupo grupoModelo = new Grupo();

        // Instancias de los controladores, vinculando modelos y vista
        ControladorAlumno controladorAlumno = new ControladorAlumno(alumnoModelo, vista);
        ControladorCatedratico controladorCatedratico = new ControladorCatedratico(catedraticoModelo, vista);
        ControladorEspecialidad controladorEspecialidad = new ControladorEspecialidad(especialidadModelo, vista);
        ControladorMateria controladorMateria = new ControladorMateria(materiaModelo, vista);
        ControladorGrupo controladorGrupo = new ControladorGrupo(grupoModelo, vista);

        // Mostrar la ventana principal (vista)
        vista.setVisible(true);
    }
}