package ejercicio1;

import java.util.Scanner;

/**
 * @author Jeimy Josue Guanuchi Ruiz
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor de fila " + i + ", columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: " + sumaDiagonal);
    }
}