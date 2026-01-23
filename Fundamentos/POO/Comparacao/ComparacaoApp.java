package POO.Comparacao;

public class ComparacaoApp {
    public static void main(String[] args){
//        stack vs heap
        Integer i1 = 10;
        Integer i2 = Integer.parseInt("10");

        System.out.println(i1.equals(i2));
        System.out.println(i1 == i2);

        String nome1 = "Fagno";
        String nome2 = "fagno";

        System.out.println(nome1.equalsIgnoreCase(nome2));

    }
}
