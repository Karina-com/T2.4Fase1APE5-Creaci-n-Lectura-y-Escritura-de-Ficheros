
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            // 1. Solicitar un mensaje al usuario
            System.out.println("Ingrese un mensaje:");
            String mensaje = teclado.nextLine();

            // 2. Abrir el archivo para escribir
            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            // 3. Guardar el mensaje
            escritor.write(mensaje + "\n");

            // 4. Cerrar el archivo
            escritor.close();

            // 5. Mostrar confirmación
            System.out.println("La información se guardó correctamente.");

        } catch (IOException e) {

            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();

        }

        teclado.close();
    }
}
