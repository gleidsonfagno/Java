package Execicio;

import java.util.Scanner;

public class PlanoOperadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digíte Seu plano: B = Basic, M = Mídia, T = TURBO ");
        String valor = scanner.nextLine();

        switch (valor) {
            case "B": {
                System.out.println("Você contratou o plano BASIC: 100 minútos de ligação");
                break;
            }
            case "M": {
                System.out.println("Você contratou o plano MÌDIA: 100 minútos de ligação + WhatsZap E instagram gratís");
                break;
            }
            case "T": {
                System.out.println("Voce contratou o plano TURBO: 100 minútos de ligação + WhatsZap E instagram gratís + 5 GB YouTube");
                break;
            }
            default: {
                System.out.println("Informe um valor valido");
            }
        }
    }
}
