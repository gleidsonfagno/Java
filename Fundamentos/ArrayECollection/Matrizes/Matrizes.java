package ArrayECollection.Matrizes;

public class Matrizes {
    public static void main(String[] args) {
        //definindo contantes
//        final int RENGLONES = 2;
//        final int COLLUMNAS = 3;
        // definindo matriz
//        int[][] matriz = new int[RENGLONES][COLLUMNAS];
//        matriz[0][0] = 100;
//        matriz[0][1] = 200;
//        matriz[0][2] = 300;
//        matriz[1][0] = 400;
//        matriz[1][1] = 500;
//        matriz[1][2] = 600;

        int[][] matriz = {{100,200,300}, {400,500,600}};

        // percorrer as linhas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // percorrer as colunas
                System.out.print("Valor[" + i + "][" + j + "]" + matriz[i][j] + "\n");
            }
        }
    }
}
