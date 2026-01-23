package Execicio.modulo2;

import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero maior que o primeiro: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite P, para 'PAR', é I, para 'INPAR'");
        String opcao = scanner.nextLine();

        while (numero1 <= numero2){


            if (opcao.equals("P")){
                if (numero2 % 2 == 0){
                    System.out.println(numero2);
                }
            }else if (opcao.equals("I")){
                if (numero2 % 2 == 1){
                    System.out.println(numero2);
                }
            }else {
                System.out.println("Opção invalida!");
            }
            --numero2;

        }

    }
    
    
}
