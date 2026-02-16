package List.PesquisaEmList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numerosList = new ArrayList<>();

    public void adicionarNumero(int numero){
        numerosList.add(new Numero(numero));
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numerosList.isEmpty()) {
            for(Numero numero: numerosList){
                soma += numero.getNumero();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Numero numero: numerosList){
            if (numero.getNumero() > maiorNumero){
                maiorNumero = numero.getNumero();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for (Numero numero: numerosList){
            if (numero.getNumero() < menorNumero){
                menorNumero = numero.getNumero();
            }
        }

        return menorNumero;
    }

    public void exibirNumeros(){
        for (Numero numero: numerosList){
            System.out.println("Todos os numeros: " + numero.getNumero());
        }
//        System.out.println("Todos os numeros: " + this.numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(10);
        soma.adicionarNumero(44);
        soma.adicionarNumero(9);
        soma.adicionarNumero(15);

        System.out.println("Soma dos numero: " + soma.calcularSoma());
        System.out.println("Maior numero: " + soma.encontrarMaiorNumero());
        System.out.println("Menor numero: " + soma.encontrarMenorNumero());
        soma.exibirNumeros();
    }

}
