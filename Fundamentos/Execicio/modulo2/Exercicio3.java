package Execicio.modulo2;
//Escreva um código que o usuário entre com um primeiro número,
// um segundo número maior que o primeiro e escolhe entre a opção par e impar,
// com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial)
// no intervalo de números informados, incluindo os números informados e em ordem decrescente;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio3 {

    void InparOuPar(int numero){
        int result = numero % 2;

        if (result == 0){
            System.out.println("Par");
        }else {
            System.out.println("Inpar");
        }
    }

    public static void main (String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = scaner.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scaner.nextInt();

        while (numero2 <°/= numero2){
            System.out.println(numero1);
            ++numero1;
        }

    }
    
    
}
