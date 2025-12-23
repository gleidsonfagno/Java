package ControleDeFluxo.Excepcionais;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static Integer validateInteger(String params){
        try {
           return Integer.parseInt(params.trim());
        } catch (Exception e) {
//            System.out.println("Erro: valor inválido, digite apenas números");
            throw new RuntimeException("Erro: valor inválido, digite apenas números",e);

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

//        System.out.println("Digite seu nome: ");
//        String nome = input.next().trim();
//        if (nome.isEmpty()) {
//            System.out.println("O como não pode ser vazio!");
//        }
//
//        System.out.println("Digite seu sobrenome: ");
//        String sobrenome = input.next().trim();
//
//        if (sobrenome.isEmpty()) {
//            System.out.println("O como não pode ser vazio!");
//        }
        
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        



        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Digite sua peso: ");
        double peso = input.nextDouble();


        System.out.println(String.format("Olá %s %s, você tem %s anos, %s de altura, %s kg",idade,  altura, peso));
    }
}
