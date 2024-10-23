package controlador;

import dao.DAOAlumno;
import modelo.Alumno;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAlumno {
    private Alumno modelo;
    private Vista vista;
    private DAOAlumno daoAlumno;

    public ControladorAlumno(Alumno modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.daoAlumno = new DAOAlumno();
        this.vista.menuItemAgregarAlumno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarAlumno();
            }
        });
    }

    public void registrarAlumno() {
        String[] datos = vista.mostrarFormularioAlumno();
        if (datos != null) {
            modelo.setNombre(datos[0]);
            modelo.setNumControl(Integer.parseInt(datos[1]));

            // Guardar alumno en DAO
            if (daoAlumno.agregar(modelo)) {
                vista.mostrarMensaje("Alumno registrado con éxito!");
            } else {
                vista.mostrarMensaje("Error al registrar el alumno.");
            }
        }
    }
}
