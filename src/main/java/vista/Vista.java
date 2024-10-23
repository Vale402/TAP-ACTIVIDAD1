package vista;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    // Componentes de la interfaz
    public JMenuItem menuItemAgregarAlumno = new JMenuItem("Agregar Alumno");
    public JMenuItem menuItemMostrarAlumnos = new JMenuItem("Mostrar Alumnos");
    public JMenuItem menuItemAgregarCatedratico = new JMenuItem("Agregar Catedrático");
    public JMenuItem menuItemMostrarCatedraticos = new JMenuItem("Mostrar Catedráticos");
    public JMenuItem menuItemAgregarEspecialidad = new JMenuItem("Agregar Especialidad");
    public JMenuItem menuItemMostrarEspecialidades = new JMenuItem("Mostrar Especialidades");
    public JMenuItem menuItemAgregarMateria = new JMenuItem("Agregar Materia");
    public JMenuItem menuItemMostrarMaterias = new JMenuItem("Mostrar Materias");
    public JMenuItem menuItemAgregarGrupo = new JMenuItem("Agregar Grupo");
    public JMenuItem menuItemMostrarGrupos = new JMenuItem("Mostrar Grupos");
    private JLabel lblBienvenida = new JLabel("TENOCH PEREZ PEREZ- 22020725", JLabel.CENTER);

    public Vista() {
        setTitle("Gestión Escolar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);  // Centra la ventana

        // Crear el menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Menú Alumnos
        JMenu menuAlumnos = new JMenu("Alumnos");
        menuBar.add(menuAlumnos);
        menuAlumnos.add(menuItemAgregarAlumno);
        menuAlumnos.add(menuItemMostrarAlumnos);

        // Menú Maestros
        JMenu menuMaestros = new JMenu("Catedraticos");
        menuBar.add(menuMaestros);
        menuMaestros.add(menuItemAgregarCatedratico);
        menuMaestros.add(menuItemMostrarCatedraticos);

        // Menú Especialidades
        JMenu menuEspecialidades = new JMenu("Especialidades");
        menuBar.add(menuEspecialidades);
        menuEspecialidades.add(menuItemAgregarEspecialidad);
        menuEspecialidades.add(menuItemMostrarEspecialidades);

        // Menú Materias
        JMenu menuMaterias = new JMenu("Materias");
        menuBar.add(menuMaterias);
        menuMaterias.add(menuItemAgregarMateria);
        menuMaterias.add(menuItemMostrarMaterias);

        // Menú Grupos
        JMenu menuGrupos = new JMenu("Grupos");
        menuBar.add(menuGrupos);
        menuGrupos.add(menuItemAgregarGrupo);
        menuGrupos.add(menuItemMostrarGrupos);

        // Panel Superior con barra azul
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

        // Panel Central para la imagen
        JPanel panelCentral = new JPanel();
        ImageIcon iconoOriginal = new ImageIcon("C:\\Users\\valer\\IdeaProjects\\ActClases\\src\\main\\java\\Imagenes\\Logoitver.png");
        Image imagenOriginal = iconoOriginal.getImage();
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(322, 245, Image.SCALE_SMOOTH);  // Ajusta el tamaño según necesites
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        JLabel imagenLabel = new JLabel(iconoRedimensionado);
        panelCentral.add(imagenLabel);
        add(panelCentral, BorderLayout.CENTER);
    }

    // Método para mostrar un cuadro de diálogo para registrar un alumno
    public String[] mostrarFormularioAlumno() {
        JTextField nombre = new JTextField(10);
        JTextField numeroControl = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Número de control:"));
        panel.add(numeroControl);

        int result = JOptionPane.showConfirmDialog(null, panel, "Registrar Alumno", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
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

    // Método para mostrar un cuadro de diálogo para registrar una especialidad
    public String[] mostrarFormularioEspecialidades() {
        JTextField nombre = new JTextField(10);
        JTextField clave = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Clave:"));
        panel.add(clave);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Especialidad", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
                    clave.getText()
            };
        }
        return null;
    }

    // Método para mostrar un cuadro de diálogo para registrar una materia
    public String[] mostrarFormularioMateria() {
        JTextField nombre = new JTextField(10);
        JTextField clave = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Clave:"));
        panel.add(clave);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Materia", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
                    clave.getText()
            };
        }
        return null;
    }

    // Método para mostrar un cuadro de diálogo para registrar un grupo
    public String[] mostrarFormularioGrupo() {
        JTextField nombre = new JTextField(10);
        JTextField clave = new JTextField(10);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Nombre:"));
        panel.add(nombre);
        panel.add(new JLabel("Clave:"));
        panel.add(clave);

        int result = JOptionPane.showConfirmDialog(null, panel, "Agregar Grupo", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            return new String[]{
                    nombre.getText(),
                    clave.getText()
            };
        }
        return null;
    }
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}