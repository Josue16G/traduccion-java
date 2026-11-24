package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("Cantidad de pares: " + cantPares);
        System.out.println("Cantidad de impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}