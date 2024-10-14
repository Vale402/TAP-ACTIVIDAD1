package ventanas;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    // Componentes de la interfaz
    public JButton btnRegistrarAlumno = new JButton("Registrar Alumno");
    public JButton btnAgregarCatedratico = new JButton("Agregar Catedrático");
    public JButton btnEspecialidades = new JButton("Especialidades");
    public JButton btnMaterias = new JButton("Materias");
    private JLabel lblBienvenida = new JLabel("TENOCH PEREZ PEREZ- 22020725", JLabel.CENTER);

    public Vista() {
        setTitle("Gestión Escolar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);  // Centra la ventana

        // Crear panel superior con barra azul
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());
        panelSuperior.setBackground(new Color(1, 78, 130));  // Azul fuerte

        JLabel lblTitulo = new JLabel("INSTITUTO TECNOLÓGICO DE VERACRUZ", JLabel.CENTER);
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        panelSuperior.add(lblTitulo, BorderLayout.NORTH);

        JLabel lblBienvenida = new JLabel("Bienvenid(a)", JLabel.CENTER);
        lblBienvenida.setForeground(Color.ORANGE);
        lblBienvenida.setFont(new Font("Arial", Font.PLAIN, 14));
        panelSuperior.add(lblBienvenida, BorderLayout.CENTER);

        this.lblBienvenida.setForeground(Color.ORANGE);
        this.lblBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        panelSuperior.add(this.lblBienvenida, BorderLayout.SOUTH);

        add(panelSuperior, BorderLayout.NORTH);

        // Panel Central para contener los botones y la imagen
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());

        // Panel para los botones (encima de la imagen)
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout());
        panelBotones.setBackground(new Color(238, 238, 238));

        btnRegistrarAlumno.setBackground(new Color(213, 219, 219));  // Color neutro
        btnRegistrarAlumno.setForeground(Color.BLACK);
        panelBotones.add(btnRegistrarAlumno);

        btnAgregarCatedratico.setBackground(new Color(213, 219, 219));
        btnAgregarCatedratico.setForeground(Color.BLACK);
        panelBotones.add(btnAgregarCatedratico);

        btnEspecialidades.setBackground(new Color(213, 219, 219));
        btnEspecialidades.setForeground(Color.BLACK);
        panelBotones.add(btnEspecialidades);

        btnMaterias.setBackground(new Color(213, 219, 219));
        btnMaterias.setForeground(Color.BLACK);
        panelBotones.add(btnMaterias);

        panelCentral.add(panelBotones, BorderLayout.NORTH);

        // Imagen en el centro del panel central
        ImageIcon iconoOriginal = new ImageIcon("C:\\Users\\oafv2\\IdeaProjects\\TAP-ACTIVIDAD1\\src\\main\\java\\Imagenes\\Logoitver.png");
        Image imagenOriginal = iconoOriginal.getImage();
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(322, 245, Image.SCALE_SMOOTH);  // Ajusta el tamaño según necesites
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        JLabel imagenLabel = new JLabel(iconoRedimensionado);
        panelCentral.add(imagenLabel, BorderLayout.CENTER);

        add(panelCentral, BorderLayout.CENTER);
    }

    // Método para mostrar un cuadro de diálogo para registrar un alumno
    public String[] mostrarFormularioAlumno() {
        JTextField nombre = new JTextField(10);
        JTextField especialidad = new JTextField(10);
        JTextField curp = new JTextField(10);
        JTextField edad = new JTextField(10);
        JTextField numeroControl = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Especialidad:"));
        panel.add(especialidad);
        panel.add(new JLabel("CURP:"));
        panel.add(curp);
        panel.add(new JLabel("Edad:"));
        panel.add(edad);
        panel.add(new JLabel("Número de control:"));
        panel.add(numeroControl);

        int result = JOptionPane.showConfirmDialog(null, panel, "Registrar Alumno", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
                    especialidad.getText(),
                    curp.getText(),
                    edad.getText(),
                    numeroControl.getText()
            };
        }
        return null;
    }

    // Método para mostrar un cuadro de diálogo para registrar un catedrático
    public String[] mostrarFormularioCatedratico() {
        JTextField nombre = new JTextField(10);
        JTextField rfc = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("RFC:"));
        panel.add(rfc);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Catedrático", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
                    rfc.getText()
            };
        }
        return null;
    }

    public void mostrarEspecialidades(String[] especialidades) {
        JOptionPane.showMessageDialog(this, "Especialidades disponibles: \n" + String.join("\n", especialidades));
    }
    public void mostrarMaterias(String[] especialidades) {
        JOptionPane.showMessageDialog(this, "Materias disponibles: \n" + String.join("\n", especialidades));
    }
}

