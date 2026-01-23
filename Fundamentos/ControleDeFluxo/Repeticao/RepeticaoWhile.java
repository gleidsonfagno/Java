package ControleDeFluxo.Repeticao;

import java.util.Random;

public class RepeticaoWhile {
    public static void main (String[] args) {
        boolean acordado = true;

        // for (int carneirinhos = 1; carneirinhos <= 15; carneirinhos++){
        //     System.out.println("Carneirinhos: " + carneirinhos);
        //     if (dormiu = new Random().nextInt(15) == carneirinhos){
        //         System.out.println("Dormiu");
        //         break;
        //     }
        // }
         int carneirinhos = 0;
           while (acordado ){
               System.out.println("Contadno carneirinhos " + (++carneirinhos));
               acordado = !(new Random().nextInt(3) == carneirinhos);
               if (carneirinhos == 12) {
                carneirinhos = 0;
               }
               
           }
           System.out.println("Dormiu....");
    }
}
