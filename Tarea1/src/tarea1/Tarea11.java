/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Locale;
import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el número 1: ");
        double numero = sc.nextDouble();
        double mayor = numero;
        double menor = numero;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}