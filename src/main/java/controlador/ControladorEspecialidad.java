package controlador;

import dao.DAOEspecialidad;
import modelo.Especialidad;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorEspecialidad {
    private Especialidad modelo;
    private Vista vista;
    private DAOEspecialidad daoEspecialidad;

    public ControladorEspecialidad(Especialidad modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.daoEspecialidad = new DAOEspecialidad();
        this.vista.menuItemAgregarEspecialidad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarEspecialidad();
            }
        });
    }

    public void registrarEspecialidad() {
        String[] datos = vista.mostrarFormularioEspecialidades();
        if (datos != null) {
            modelo.setNombre(datos[0]);
            modelo.setClave(datos[1]);

            // Guardar especialidad en DAO
            if (daoEspecialidad.agregar(modelo)) {
                vista.mostrarMensaje("Especialidad registrada con éxito!");
            } else {
                vista.mostrarMensaje("Error al registrar la especialidad.");
            }
        }
    }
}

