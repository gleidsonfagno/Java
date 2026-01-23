package ControleDeFluxo.Excepcionais;

import javax.security.auth.login.CredentialException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static  String validateStirng(String params) {
        String value = params.trim();
        if (value.isEmpty()){
            System.err.println("não pode ser nulo ou vazio");
            return null;
        }
        if (value.length() <= 3){
            System.err.println("Precisa ter mais que 3 caracteres");
            return null;
        }
        return value;
    }

    public static Integer validateIdade(String params){
        try {
            int idade = Integer.parseInt(params.trim());
            if (idade <=0 || idade > 130){
                System.err.println("Idade inválida");
                return null;
            }
            return idade;
        } catch (NumberFormatException e) {
            System.err.println("Erro: idade deve ser um número inteiro");
            return null;
        }
    }

    public static Double validateDouble(String params){
        try {
            double altura = Double.parseDouble(params.trim());
            if (altura < 0.50 || altura > 3.30) {
                System.err.println("Altura inválida (user valores entre 0.50 e 2.80)");
                return null;
            }
            return altura;
        } catch (NumberFormatException e) {
            System.err.println("Erro: altura deve ser um número");
            return null;
        }
    }

    public static Double validatePeso(String params) {
        try {
            double peso = Double.parseDouble(params.trim());

            if (peso < 2 || peso > 500) {
                System.err.println("Peso inválido (use valores entre 2 e 500 kg)");
                return null;
            }

            return peso;

        } catch (NumberFormatException e) {
            System.err.println("Erro: peso deve ser um número");
            return null;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = input.next();
        String nomeValido = validateStirng(nome);

        while (nomeValido == null) {
            System.out.println("Digite seu nome novamente: ");
            nome = input.next();
            nomeValido = validateStirng(nome);
        }


        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.next();
        String sobrenomeValido = validateStirng(sobrenome);
        while (sobrenomeValido == null) {
            System.out.println("Digite seu sobrenome novamente : ");
            sobrenome = input.next();
            sobrenomeValido = validateStirng(sobrenome);
        }

        System.out.println("Digite sua idade: ");
        String idade = input.next();
        Integer idadeValida = validateIdade(idade);
        while (idadeValida == null) {
            System.out.println("Digite sua idade novamente: ");
            idade = input.next();
            idadeValida = validateIdade(idade);
        }

        System.out.println("Digite sua altura: ");
        String altura = input.next();
        Double alturaValida = validateDouble(altura);

        while (alturaValida == null) {
            System.out.println("Digite sua altura novamente: ");
            altura = input.next();
            alturaValida = validateDouble(altura);
        }

        System.out.println("Digite seu peso: ");
        String peso = input.next();
        Double pesoValido = validatePeso(peso);
        while (pesoValido == null){
            System.out.println("Digite seu peso novamente: ");
            peso = input.next();
            pesoValido = validatePeso(peso);
        }


        System.out.println("Olá, meu nome e " + nomeValido + " " + sobrenomeValido);
        System.out.println("Tenho " + idadeValida + " é tenho " + alturaValida + " de altura é " + pesoValido + " Kg" );

    }


}
