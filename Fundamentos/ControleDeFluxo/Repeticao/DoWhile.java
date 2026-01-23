package ControleDeFluxo.Repeticao;

import java.util.Random;

public class DoWhile {
    private static int numeroTentativas = 0;
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando. trin, trin");
        }while (tocadno());
        if (numeroTentativas <5) {
            System.out.println("Alô !!!");
        }else {
            System.out.println("Não atendeu");
        }
    }
    private static  boolean tocadno() {
        boolean atendeu = new Random().nextInt(5)==1;
        numeroTentativas++;
        if (numeroTentativas==5) {
            return false;
        }else {
         return  !atendeu;
        }
        //System.out.println("Atendeu? " + atendeu);
        // Nega o ato de continuar tocando
    }
}
