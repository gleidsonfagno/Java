package POO.Classes.Enums;

public class SistemaEnumeracao {
    public static void main(String[] args){
        String nomeString = "SAO_PAULO";
//        EstadoBrasileiro eb = EstadoBrasileiro.valueOf(nomeString);
        for(EstadoBrasileiro eb: EstadoBrasileiro.values()){
            System.out.println("Estado localizado" );
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
            System.out.println(eb.name());
        }
    }
}
