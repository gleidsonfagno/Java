package Execicio.modulo2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Digite sua altura : ");
//        double altura = scanner.nextDouble();
//        System.out.println("Digite seu peso : ");
//        double peso = scanner.nextDouble();
        double altura = 1.81;
        double peso = 90;

        //double IMC = (altura*peso)/100;
        double IMC = peso/(altura*altura);

        if (IMC <= 18.5){
            System.out.println("Abaixo do peso");
        }else  if (IMC > 18.5 && IMC <= 24.9){
            System.out.println("Peso ideal");
        }else   if (IMC > 24.9 && IMC <= 29.9){
            System.out.println("Levemente acima do peso");
        }
        else if (IMC > 30 && IMC <= 34.9){
            System.out.println("Obesidade grau I");
        }else if (IMC >3 && IMC <=39.9){
            System.out.println("Obesidade grau II (Severa)");
        } else if (IMC > 40) {
            System.out.println("Obesidade grau III (Mórbida)");
        }

    }
}
