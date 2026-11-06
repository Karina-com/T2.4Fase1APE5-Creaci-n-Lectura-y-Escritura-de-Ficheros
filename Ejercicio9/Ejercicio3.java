
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {

    public static void main(String[] args) {

        try {

            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("materias.txt", true)
            );

            escritor.write("Historia");
            escritor.newLine();

            escritor.write("Biologia");
            escritor.newLine();

            escritor.close();

            System.out.println("Nuevas asignaturas agregadas correctamente.");

        } catch (IOException e) {

            System.out.println("Error al escribir el archivo: " + e.getMessage());

        }
    }
}

