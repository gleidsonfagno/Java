// Exercícios
// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

// Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

// fórmula: área=lado X lado
// Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

// fórmula: área=base X altura
// Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
package Execicio;

import java.util.Scanner;

public class Fundamentos {
    
    static Scanner scanner = new Scanner(System.in);
    
    void ImprimirIdadeNome() {

        System.out.println("Qual e o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Qual sua idade");
        int idade = scanner.nextInt();

        System.out.println("Ola, " + nome + " você tem " + idade + " anos");
        return;
    }

    void CalcularQuadrado() {
        System.out.println("Qual o tamanho do lado do quadrado");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.println(area);
    }

    void CalcularRetangulo() {
        System.out.println("Qual e a altura") ;
        int altura = scanner.nextInt();
        System.out.println("Qual e a base");
        int base = scanner.nextInt();
        int area = base * altura;
        System.out.println(area);
    }

    void CalcularDiferencaIdade () {
        System.out.println("Qual seu nome");
        String nome1 = scanner.nextLine();
        System.out.println("Qual sua idade?");
        int idade1 = scanner.nextInt();

        System.out.println("nova pesquisa __________________________");
        scanner.nextLine();

        System.out.println("Qual o seu nome");
        String nome2 = scanner.nextLine();
        System.out.println("Qual sua idade?");
        int idade2 = scanner.nextInt();
        
        int diferenca = Math.abs(idade1 - idade2);
        System.out.println("A diferença das idades é: " + diferenca);
    }
    public static void main(String[] args) {
        Fundamentos obj = new Fundamentos();
        // obj.ImprimirIdadeNome();
        // obj.CalcularQuadrado();
        // obj.CalcularRetangulo();
        obj.CalcularDiferencaIdade();
    }

}
