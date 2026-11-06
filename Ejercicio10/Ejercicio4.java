
import java.io.File;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {

        File archivo = new File("datos/temporal.txt");

        try {

            // Comprobar si el archivo existe
            if (archivo.exists()) {

                System.out.println("El archivo ya existe.");

            } else {

                // Crear el archivo
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            // Confirmar el borrado
            boolean confirmarBorrado = true;

            if (confirmarBorrado) {

                boolean eliminado = archivo.delete();

                System.out.println("¿Se elimino el archivo? " + eliminado);

            } else {

                System.out.println("El archivo no sera eliminado.");

            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }
}
