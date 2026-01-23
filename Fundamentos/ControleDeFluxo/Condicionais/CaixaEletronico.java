package ControleDeFluxo.Condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        // Condicionais simples
        double saldo = 10.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado <= saldo) {
            double res = Math.abs(valorSolicitado - saldo);
            System.out.println("Saque de: " + valorSolicitado + " R$ efetuado" );
        }
        else {
            System.out.println("O saldo e insuficiente !");
        }
    }
}
