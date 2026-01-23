package Execicio.modulo2;

import java.util.Scanner;

//4. Escreva um código onde o usuário informa um número inicial,
// posteriormente irá informar outros N números,
// a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
// números menores que o primeiro número devem ser ignorados
public class Exercicio4 {
    public static void main(String[] args){
        var scaner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int number = scaner.nextInt();
        boolean keepVerify = true;

        while(keepVerify){
            System.out.println("Informe outro numero para verificação: ");
            int toVerify = scaner.nextInt();
            if(toVerify < number) {
                System.out.printf("Informe um número maior que %s \n", number);
                continue;
            }

            int result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        }
    }
}
