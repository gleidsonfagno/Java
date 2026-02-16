package List.PesquisaEmList.CatálogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributos
    private final List<Livro> livrosList;

    public CatalogoLivros() {
//        inicia o array vazio
        this.livrosList = new ArrayList<>();
    }

    public void  adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAuthor = new ArrayList<>();
        if (livrosList.isEmpty()) {
            System.out.println("Nenhum livro encontrado!");
        }else {
            for(Livro livro: livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAuthor.add(livro);
                }
            }
        }
        return livrosPorAuthor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro: livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }else {
            System.out.println("Nenhum livro encontrado!");
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!this.livrosList.isEmpty()) {
            for (Livro livro: this.livrosList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo =  livro;
                    break;
                }
            }
        }else {
            System.out.println("Nenhum livro encontrado!");
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Titulo", "Autor", 1999);
        catalogoLivros.adicionarLivro("Titulo 2", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Titulo 3", "Autor 3", 2001);
        catalogoLivros.adicionarLivro("Titulo 4", "Autor 4", 2003);
        catalogoLivros.adicionarLivro("Titulo", "Autor", 2008);
        System.out.println("Pesquisa por autor: \n" + catalogoLivros.pesquisarPorAutor("Autor 4") + "\n");
        System.out.println("Pesquisa por intervalo de ano: \n" + catalogoLivros.pesquisarPorIntervaloAnos(1999, 2001) + "\n");
        System.out.println("Pesquisa por titulo: \n" + catalogoLivros.pesquisarPorTitulo("Titulo"));

    }
}
