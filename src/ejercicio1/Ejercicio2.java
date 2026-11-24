package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }

        promedio = suma / 10;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}