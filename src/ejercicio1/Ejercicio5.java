package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        int numero;

        for (int i = 0; i < 12; i++) {
            do {
                System.out.print("Ingrese el numero positivo " + (i + 1) + ": ");
                numero = sc.nextInt();
            } while (numero <= 0);
            numeros[i] = numero + i;
        }

        System.out.println("Arreglo final:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}