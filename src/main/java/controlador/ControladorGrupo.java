package controlador;

import dao.DAOGrupo;
import modelo.Grupo;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorGrupo {
    private Grupo modelo;
    private Vista vista;
    private DAOGrupo daoGrupo;

    public ControladorGrupo(Grupo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.daoGrupo = new DAOGrupo();
        this.vista.menuItemAgregarGrupo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarGrupo();
            }
        });
    }

    public void registrarGrupo() {
        String[] datos = vista.mostrarFormularioGrupo();
        if (datos != null) {
            modelo.setClave(datos[0]);
            modelo.setNombre(datos[1]);

            // Guardar grupo en DAO
            if (daoGrupo.agregar(modelo)) {
                vista.mostrarMensaje("Grupo registrado con éxito!");
            } else {
                vista.mostrarMensaje("Error al registrar el grupo.");
            }
        }
    }
}
