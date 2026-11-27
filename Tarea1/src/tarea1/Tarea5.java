package tarea1;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Locale;
import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese una calificación entre 0 y 10: ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Calificación fuera de rango.");
        } else if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8) {
            System.out.println("Muy Bueno");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}