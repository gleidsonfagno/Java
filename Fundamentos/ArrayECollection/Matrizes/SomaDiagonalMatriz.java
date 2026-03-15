package ArrayECollection.Matrizes;

import java.util.Scanner;

public class SomaDiagonalMatriz {
    public static void main(String[] args) {
        //introduzir valores a uma matriz
        int row, column;
        Scanner input = new Scanner(System.in);
        //Definomos as matrizes
        System.out.println("Add rows: ");
        row = input.nextInt();
        System.out.println("Add columns: ");
        column = input.nextInt();
        int[][] matriz = new int[row][column];
        //solicitar os valores
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Valor[" + i + "][" + j + "] = " );
                matriz[i][j] = Integer.parseInt(input.next());

            }
        }
        // Somar os valores na diagonal da matriz
        var somaDiagonalMatriz = 0;
        for (int r = 0; r < matriz.length; r++) {
            for (int c = 0; c < matriz[r].length; c++) {
                System.out.print(matriz[r][c] + " ");
               if (r == c) {
                   somaDiagonalMatriz += matriz[r][c];
               }
            }
        }
        System.out.println("Soma diagonal matriz: " + somaDiagonalMatriz);
    }
}
