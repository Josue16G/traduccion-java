package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int mayor, menor;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor de fila " + i + ", columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}