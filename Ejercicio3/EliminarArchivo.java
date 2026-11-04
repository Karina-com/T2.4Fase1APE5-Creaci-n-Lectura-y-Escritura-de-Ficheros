
import java.io.File;

public class EliminarArchivo {

    public static void main(String[] args) {

        // 1. Crear un objeto File
        File archivo = new File("estudiantes.txt");

        // 2. Intentar eliminar el archivo
        if (archivo.delete()) {

            System.out.println("El archivo se eliminó correctamente.");

        } else {

            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}

