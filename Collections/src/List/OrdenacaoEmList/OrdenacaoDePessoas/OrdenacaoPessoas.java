package List.OrdenacaoEmList.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add( new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(new CompararPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacao.adicionarPessoa("Nome 2", 30, 1.46);
        ordenacao.adicionarPessoa("Nome 3", 25, 1.86);

        System.out.println("Pessoas ordenadas por idade:" + ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());
    }
}
