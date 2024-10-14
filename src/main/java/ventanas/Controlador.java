package ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Acción para el botón de registrar alumno
        this.vista.btnRegistrarAlumno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] datosAlumno = vista.mostrarFormularioAlumno();
                if (datosAlumno != null) {
                    modelo.registrarAlumno(datosAlumno);
                }
            }
        });

        // Acción para el botón de agregar catedrático
        this.vista.btnAgregarCatedratico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] datosCatedratico = vista.mostrarFormularioCatedratico();
                if (datosCatedratico != null) {
                    modelo.registrarCatedratico(datosCatedratico);
                }
            }
        });

        // Acción para el botón de especialidades
        this.vista.btnEspecialidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.mostrarEspecialidades(modelo.obtenerEspecialidades());
            }
        });
    }

    public void iniciarVista() {
        vista.setVisible(true);
    }
}
