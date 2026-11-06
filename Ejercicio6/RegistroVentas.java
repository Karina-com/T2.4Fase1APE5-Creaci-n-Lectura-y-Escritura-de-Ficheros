
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double totalAcumulado = 0;

        try {
            BufferedWriter escritor = new BufferedWriter(
                new FileWriter("ventas.txt", true)
            );

            String nombre;

            while (true) {

                System.out.print("Ingrese el nombre del producto (o escriba fin): ");
                nombre = entrada.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Ingrese el precio: ");
                double precio = entrada.nextDouble();

                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = entrada.nextInt();

                entrada.nextLine();

                double subtotal = precio * cantidad;
                double descuento = 0;

                if (subtotal >= 100) {
                    descuento = subtotal * 0.10;
                }

                double totalPagar = subtotal - descuento;

                totalAcumulado += totalPagar;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + totalPagar);

                escritor.write("Producto: " + nombre);
                escritor.newLine();

                escritor.write("Precio: $" + precio);
                escritor.newLine();

                escritor.write("Cantidad: " + cantidad);
                escritor.newLine();

                escritor.write("Subtotal: $" + subtotal);
                escritor.newLine();

                escritor.write("Descuento: $" + descuento);
                escritor.newLine();

                escritor.write("Total a pagar: $" + totalPagar);
                escritor.newLine();

                escritor.newLine();
            }

            escritor.write("TOTAL ACUMULADO DE VENTAS: $" + totalAcumulado);
            escritor.newLine();
            escritor.newLine();

            escritor.close();

            System.out.println("\nRegistro de ventas finalizado.");
            System.out.println("Total acumulado: $" + totalAcumulado);

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

        entrada.close();
    }
}

