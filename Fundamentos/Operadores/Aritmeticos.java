import java.util.*;

public class Aritmeticos {
    
    public static void  main(String[] args) {
        // operador de atribuição = , Concatenação e soma +,/ concat(params)
        String nome = "Fagno".concat(" Conceição");
        int idade = 24;
        double peso = 88.00;
        char sexo = 'm';
        boolean doadorSangue = true;
        Date dataNacimento = new Date();
        
        System.out.println(nome + "\n" + idade + "\n" + peso + "\n" + sexo+ "\n" + doadorSangue+ "\n" + dataNacimento);
        // Operadores aritimeticos  adição(+), subtração(-), divisão(/), multiplicação(*) modululo ou resto da divisão %;

        double soma =  33.0 + 31.90;
        int  subtracao = 323 - 89;
        int multiplicacao = 87 * 34;
        int divisão = 10 / 5;
        int modululo =  32 % 80;
        double resultado  = (10  * 7) + (20/4);

        System.out.println(modululo);

        // abrevisaoção aritimetica n2 += n1 

        // Operadores Unarios. (++ adiciona mais um), (-- descremetna), (! nega)
        int numero = 3;
        System.out.println(numero++);
        System.out.println(++numero);

        System.out.println(numero--);
        System.out.println(--numero);

        boolean condicao = true;
        boolean negacao = !condicao;

        System.out.println(negacao);
    }
}
