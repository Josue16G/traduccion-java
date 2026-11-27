/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Scanner;

public class Tarea10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            suma += sc.nextInt();
        }

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 10.0));
    }
}