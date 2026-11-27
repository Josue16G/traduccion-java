/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int suma = 0;

        System.out.print("Ingrese un número positivo (negativo para terminar): ");
        int numero = sc.nextInt();

        while (numero >= 0) {
            cantidad++;
            suma += numero;
            System.out.print("Ingrese un número positivo (negativo para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}