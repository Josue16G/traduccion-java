package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        int mayor, menor, posMayor = 0, posMenor = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 1; i < 15; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del mayor: " + posMayor);
        System.out.println("Posicion del menor: " + posMenor);
    }
}