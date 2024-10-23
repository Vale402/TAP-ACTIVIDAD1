package controlador;

import dao.DAOMateria;
import modelo.Materia;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMateria {
    private Materia modelo;
    private Vista vista;
    private DAOMateria daoMateria;

    public ControladorMateria(Materia modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.daoMateria = new DAOMateria();
        this.vista.menuItemAgregarMateria.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarMateria();
            }
        });
    }

    public void registrarMateria() {
        String[] datos = vista.mostrarFormularioMateria();
        if (datos != null) {
            modelo.setNombre(datos[0]);
            modelo.setClave(datos[1]);

            // Guardar materia en DAO
            if (daoMateria.agregar(modelo)) {
                vista.mostrarMensaje("Materia registrada con éxito!");
            } else {
                vista.mostrarMensaje("Error al registrar la materia.");
            }
        }
    }
}
