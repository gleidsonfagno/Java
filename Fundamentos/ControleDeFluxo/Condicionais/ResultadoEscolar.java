package ControleDeFluxo.Condicionais;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.38;

        if(nota >= 7) {
            System.out.println("Aprovado");
        }
        else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
            fluxoIntermediario(nota);
        }
        else {
            System.out.println("Reprovado");
        }
    }

    static void fluxoIntermediario(double nota) {
        if(nota >= 6.30) {
            System.out.println("Aprovado na recuperação");
        }
    }
}