package Execicio.modulo2;
//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;


import java.util.Objects;
import java.util.Scanner;

public class ControleDeFluxo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite a opção para geera a tabuada. X = mutliplicação, / = divisão, + = adição, - = subtração ");
        String option = scanner.nextLine();

        if (Objects.equals(option, "X")){
            System.out.println("Digite um numero: ");
            int inputUser = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = inputUser * i;
                System.out.println(inputUser + " x " + i + " = " + result);
            }

        }
        else if (Objects.equals(option, "/")){
            System.out.println("Digite um numero: ");
            int inputUser = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = inputUser / i;
                System.out.println(inputUser + " / " + i + " = " + result);
            }
        }
        else if (Objects.equals(option, "+")){
            System.out.println("Digite um numero: ");
            int inputUser = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = inputUser + i;
                System.out.println(inputUser + " + " + i + " = " + result);
            }
        }
        else if (Objects.equals(option, "-")){
            System.out.println("Digite um numero: ");
            int inputUser = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                int result = inputUser - i;
                System.out.println(inputUser + " - " + i + " = " + result);
            }
        }
    }
}
