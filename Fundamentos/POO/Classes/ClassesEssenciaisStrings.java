package POO.Classes;

import java.util.Locale;
import java.util.Scanner;

public class ClassesEssenciaisStrings {
    public static void main(String[] args) {
        System.out.print("Gleidson");
        System.out.println("Fagno");
        System.err.println("Erro");

//        classe scaner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double dinheiro = scanner.nextDouble();
        System.out.println(dinheiro);

        String nome = null;
        Integer idade = null;
        Double peso = null;

        // simula uma linha existente em um arquivo txt
        String stringLinhaArquivo = "Gleidson Fagno|24|85.54";
        scanner = new Scanner(stringLinhaArquivo);
        scanner.useDelimiter("\\|"); // define delimitador

        int index = 0;
        while (scanner.hasNext()){
            if (index == 0){
                nome = scanner.next();
            }else if (index == 1){
                idade = Integer.valueOf(scanner.next());
            }else {
                peso = Double.valueOf(scanner.next());
            }
            index++;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);



        // %d → imprime número inteiro decimal
        System.out.printf("Inteiro: %d%n", 42);

        // %f → imprime número de ponto flutuante (double/float)
        System.out.printf("Decimal: %f%n", 3.14159);

        // %.2f → imprime número de ponto flutuante com 2 casas decimais
        System.out.printf("Decimal com 2 casas: %.2f%n", 3.14159);

        // %s → imprime uma string
        System.out.printf("Texto: %s%n", "Java");

        // %c → imprime um único caractere
        System.out.printf("Caractere: %c%n", 'A');

        // %b → imprime valor booleano
        System.out.printf("Booleano: %b%n", true);

        // %x → imprime número em hexadecimal (minúsculo)
        System.out.printf("Hexadecimal: %x%n", 255);

        // %o → imprime número em octal
        System.out.printf("Octal: %o%n", 255);

        // %5d → imprime número inteiro com largura mínima de 5 caracteres (alinhado à direita)
        System.out.printf("Inteiro com largura: %5d%n", 42);

        // %-5d → imprime número inteiro com largura mínima de 5 caracteres (alinhado à esquerda)
        System.out.printf("Inteiro alinhado à esquerda: %-5d%n", 42);

        // %05d → imprime número inteiro com zeros à esquerda
        System.out.printf("Inteiro com zeros: %05d%n", 42);

        // %n → quebra de linha (portável, melhor que \n)
        System.out.printf("Quebra de linha aqui%n");

//        String
        nome = "Gleidson ";
        nome = nome.concat("Fagno ");
        nome = nome.concat("Sou dev full stack java");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder();

        sb.append("Gleyson");
        sb.append("Fagno");
        System.out.println(sb);

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(2, 4));

        //metodos da classe StringBuild
        System.out.println(sb.append(" senior")); // adiciona no inicio
        System.out.println(sb.replace(0,7, "Joao")); // troca o indice 1 aou 7
        System.out.println(sb.delete(8, 16)); // deleta cartere
        System.out.println(sb.insert(0,"Conceição"));

    }
}
