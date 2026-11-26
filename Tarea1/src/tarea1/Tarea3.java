package tarea1;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
    }
}