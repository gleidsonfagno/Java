package POO.Classes;

public class Sistema {


    public static void main(String[] argsS){
        Clientes fagno = new Clientes("Gleidson Fagno");

        System.out.println("limite: " + fagno.nome + " é " + fagno.limiteCredito);
        fagno.solicitarCredito(200.00);
        fagno.compra(23.90);
        System.out.println(fagno.limiteCredito);

        Clientes leyde = new Clientes("Leyde braga");

        System.out.println(leyde.limiteCredito);
        leyde.solicitarCredito(2200.2);
        System.out.println("limite: " + leyde.nome + " é " + leyde.limiteCredito);

    }
}
