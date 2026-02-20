package List.OrdenacaoEmList.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Numero> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numerosList.add(new Numero(numero));
    }

    public void ordenarAscendente(){
//        List<Numero> listaAscendente = new ArrayList<>(numerosList);
        Collections.sort(numerosList);
    }
    public void ordenarDescendente(){
        Collections.sort(numerosList, Collections.reverseOrder());
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
        ordenacao.adicionarNumero(10);
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(3);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(21);


        System.out.println(ordenacao.numerosList);
        ordenacao.ordenarAscendente();
        System.out.println(ordenacao.numerosList);
        ordenacao.ordenarDescendente();
        System.out.println(ordenacao.numerosList);
    }
}
