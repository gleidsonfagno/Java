package Map.Ordenacao.AgendadeEventos;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return this.nome;
    }
    public String getAtracao() {
        return this.atracao;
    }

    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", atracao=" + atracao + '}';
    }
}