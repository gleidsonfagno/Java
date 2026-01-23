package ControleDeFluxo.Excepcionais;

public class Execao {
    public static void main(String[] args) {
        try {
            double numero = Double.valueOf("a1.75");
            System.out.println(numero);
        }catch (NumberFormatException ex) {
            System.err.println("Número inválido");
            ex.printStackTrace();
        }
    }
}
