package List.OrdenacaoEmList.OrdenacaoDeNumeros;

import java.util.Comparator;

public class Numero implements Comparable<Numero>{

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }
    @Override
    public int compareTo(Numero n) {
        return Integer.compare(this.numero, n.numero);
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }

}
