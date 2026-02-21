package Set.OperacoesBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<Palavra> palavraList;

    public ConjuntoPalavrasUnicas() {
       this.palavraList = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraList.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraParaRemover = null;

        for(Palavra p: palavraList){
            if (p.getPalavra().equals(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        
        palavraList.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        Palavra palavraExistente = null;

        for(Palavra p: palavraList) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraExistente = p;
                break;
            }
        }
        if (palavraExistente == null) {
            System.err.println("Palavra não encontrada!");
        }else {
            System.out.println("A palavra " + palavra + "está no conjunto" + palavraExistente);
        }

    }

    public void exibirPalavrasUnicas() {
        System.out.println("Palavra List:");
        for (Palavra p: palavraList) {
            System.out.println(p.getPalavra());
        }
//        System.out.println(palavraList);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Olá, Mundo");
        palavrasUnicas.adicionarPalavra("Estudar o BootCamp DIO Java");
        palavrasUnicas.adicionarPalavra("Estudar para o Ada Tech +");

        palavrasUnicas.removerPalavra("Olá, Mundo");

        palavrasUnicas.verificarPalavra("Estudar o BootCamp DIO Java");
        palavrasUnicas.verificarPalavra("Estudar");
        palavrasUnicas.verificarPalavra("Olá, Mundo");

//        System.out.println("\n");
        palavrasUnicas.exibirPalavrasUnicas();
    }
}
