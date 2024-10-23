package controlador;

import dao.DAOCatedratico;
import modelo.Catedratico;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCatedratico {
    private Catedratico modelo;
    private Vista vista;
    private DAOCatedratico daoCatedratico;

    public ControladorCatedratico(Catedratico modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.daoCatedratico = new DAOCatedratico();
        this.vista.menuItemAgregarCatedratico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarCatedratico();
            }
        });
    }

    public void registrarCatedratico() {
        String[] datos = vista.mostrarFormularioCatedratico();
        if (datos != null) {
            modelo.setNombre(datos[0]);
            modelo.setRfc(datos[1]);

            // Guardar catedrático en DAO
            if (daoCatedratico.agregar(modelo)) {
                vista.mostrarMensaje("Catedrático registrado con éxito!");
            } else {
                vista.mostrarMensaje("Error al registrar el catedrático.");
            }
        }
    }
}
