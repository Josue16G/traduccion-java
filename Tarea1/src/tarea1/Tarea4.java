/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Locale;
import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}