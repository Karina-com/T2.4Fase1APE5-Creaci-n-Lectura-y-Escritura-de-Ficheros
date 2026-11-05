
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("estudiantes.txt")
            );

            for (int i = 1; i <= 3; i++) {

                System.out.println("ESTUDIANTE " + i);

                System.out.print("Ingrese el nombre: ");
                String nombre = entrada.nextLine();

                System.out.print("Ingrese la calificacion: ");
                String calificacion = entrada.nextLine();

                escritor.write("Nombre: " + nombre);
                escritor.newLine();

                escritor.write("Calificacion: " + calificacion);
                escritor.newLine();

                System.out.println();
            }

            escritor.close();

            System.out.println("Datos guardados correctamente en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }

        entrada.close();
    }
}
