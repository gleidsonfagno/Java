package Set.PesquisaEmSet.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome,numero));
    }

    public void exibirContatos() {
        if (contatosSet.isEmpty()) {
            System.out.println("Contatos :" + contatosSet);
        }else {
            for (Contato contato : contatosSet) {
                System.out.println(contato);
            }
        }

    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatosAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatosAtualizado = contato;
                break;
            }
        }
        return contatosAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContatos();
        agenda.adicionarContato("Fabiana", 983279023);
        agenda.adicionarContato("Leonardo", 84343243);
        agenda.adicionarContato("Lucas", 983279023);
        agenda.adicionarContato("Lucas", 983279023);

        agenda.exibirContatos();

        System.out.println("--------------");
        System.out.println(agenda.pesquisarPorNome("Leonardo"));
        System.out.println("-------------");
        System.out.println("Contato atualizado: " + agenda.atualizarNumeroContato("Leonardo", 9999999));
        System.out.println("--------------");
        agenda.exibirContatos();
    }
}
