package ArrayECollection.Matrizes;

import java.util.Scanner;

public class MatrizComDadosDinamicos {
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
        // Iterar os valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz[" + i + "][" + j + "] = " + matriz[i][j] + "\n");
            }
        }
    }
}
