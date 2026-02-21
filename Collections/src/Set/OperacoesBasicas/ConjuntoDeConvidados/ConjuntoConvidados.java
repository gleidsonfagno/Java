package Set.OperacoesBasicas.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void  adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado.getNome() + " - " + convidado.getCodigoConvite());
        }
//        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conj = new ConjuntoConvidados();
        System.out.println("Existem: " + conj.contarConvidados() + " Convidado(s) dentro do Set de Convidados");
        conj.adicionarConvidado("Maria", 1);
        conj.adicionarConvidado("Pedro", 2);
        conj.adicionarConvidado("Julio", 3);
        conj.adicionarConvidado("Maria", 4);
//        conj.adicionarConvidado("Maria", 1);
        conj.adicionarConvidado("Pedro", 5);

//        System.out.println(conj.convidadoSet);
        conj.exibirConvidados();
        System.out.println("Existem: " + conj.contarConvidados() + " dentro do Set de Convidados");
        conj.removerConvidadoPorCodigoConvite(4);
        conj.exibirConvidados();
    }
}
