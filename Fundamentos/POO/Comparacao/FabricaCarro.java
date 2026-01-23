package POO.Comparacao;

public class FabricaCarro {

    public static void main(String[] args){
        Carro carro1 = new Carro("braca", "fiate", "palio");
        Carro carro2 = new Carro("braca", "fiate", "palio");

        System.out.println(carro1 == carro2);
        System.out.println(carro1.equals(carro2));
    }
}
