
import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        File archivo = new File("datos/prueba.txt");

        try {

            if (archivo.exists()) {

                System.out.println("El archivo ya existe.");

            } else {

                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            }

            // Mostrar informacion del archivo
            System.out.println("Nombre del archivo: " + archivo.getName());

            System.out.println("Ruta del archivo: " + archivo.getPath());

        } catch (IOException e) {

            System.out.println("Error al crear el archivo: " + e.getMessage());

        }
    }
}
