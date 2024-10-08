package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 11) {
            System.out.println("Menú de Administración Escolar:");
            System.out.println("1. Agregar Materia");
            System.out.println("2. Mostrar Materias");
            System.out.println("3. Agregar Catedrático");
            System.out.println("4. Mostrar Catedráticos");
            System.out.println("5. Agregar Grupo");
            System.out.println("6. Mostrar Grupos");
            System.out.println("7. Agregar Especialidad");
            System.out.println("8. Mostrar Especialidades");
            System.out.println("9. Agregar Alumno");
            System.out.println("10. Mostrar Alumnos");
            System.out.println("11. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    Materia.agregarMateria();
                    break;
                case 2:
                    Materia.mostrarMaterias();
                    break;
                case 3:
                    Catedratico.agregarCatedratico();
                    break;
                case 4:
                    Catedratico.mostrarCatedraticos();
                    break;
                case 5:
                    Grupo.agregarGrupo();
                    break;
                case 6:
                    Grupo.mostrarGrupos();
                    break;
                case 7:
                    Especialidad.agregarEspecialidad();
                    break;
                case 8:
                    Especialidad.mostrarEspecialidades();
                    break;
                case 9:
                    Alumno.agregarAlumno();
                    break;
                case 10:
                    Alumno.mostrarAlumnos();
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}