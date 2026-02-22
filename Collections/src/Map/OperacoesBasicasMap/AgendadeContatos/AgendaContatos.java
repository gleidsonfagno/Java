package Map.OperacoesBasicasMap.AgendadeContatos;


import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private final Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }else {
            System.out.println("A agenda está vazia");
        }
    }

    public void exibirContatos() {
        System.out.println("Agenda de contatos: " + agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("João", 5665);
        agenda.adicionarContato("Carlos", 1111111);
        agenda.adicionarContato("Ana", 654987);
        agenda.adicionarContato("Maria", 1111111);
        agenda.adicionarContato("Camila", 44444);

        agenda.exibirContatos();

        // Remover um contato
        agenda.removerContato("Maria");
        agenda.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agenda.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
