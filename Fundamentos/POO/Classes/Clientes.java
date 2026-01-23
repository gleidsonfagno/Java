package POO.Classes;

public class Clientes {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarCredito(Double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }

    public void compra (Double valorProduto){
        limiteCredito = limiteCredito - valorProduto ;
    }

    public  Clientes( String nomeInformado) {
        this.nome = nomeInformado;
    }
}
