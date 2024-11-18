package ejerc1;
import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        int cantidadAlumnos = ingresarCantidadAlumnos();

        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = ingresarAlumno();
            int cantidadNotas = ingresarCantidadNotas();

            if (cantidadNotas < 1) {
                System.out.println("Debe ingresar al menos una nota.");
                return;
            }

            for (int j = 0; j < cantidadNotas; j++) {
                Nota nota = ingresarNota();
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        mostrarInformacionAlumnos(alumnos);
    }

    private static int ingresarCantidadAlumnos() {
        System.out.println("Ingrese la cantidad de alumnos:");
        return scanner.nextInt();
    }

    private static Alumno ingresarAlumno() {
        scanner.nextLine();
        System.out.println("Ingrese el nombre completo del alumno:");
        String nombreCompleto = scanner.nextLine();
        System.out.println("Ingrese el legajo del alumno:");
        long legajo = scanner.nextLong();
        return new Alumno(nombreCompleto, legajo);
    }

    private static int ingresarCantidadNotas() {
        scanner.nextLine();
        System.out.println("Ingrese la cantidad de notas para el alumno:");
        return scanner.nextInt();
    }

    private static Nota ingresarNota() {
        scanner.nextLine();
        System.out.println("Ingrese la cátedra de la nota:");
        String catedra = scanner.nextLine();
        System.out.println("Ingrese la nota del examen:");
        double notaExamen = scanner.nextDouble();
        return new Nota(catedra, notaExamen);
    }

    private static void mostrarInformacionAlumnos(ArrayList<Alumno> alumnos) {
        System.out.println("Información de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Notas:");
            for (Nota nota : alumno.getNotas()) {
                System.out.println("Cátedra: " + nota.getCatedra() + ", Nota: " + nota.getNotaExamen());
            }
            System.out.println("Promedio: " + alumno.calcularPromedio());
            System.out.println("------------------------");
        }
    }
}
