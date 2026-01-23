package POO.Classes.Enums;

public enum EstadoBrasileiro {
    PIAUI ("Piaui", "PI"),
    MARANHAO ("Maranhão", "MA"),
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    PARA ("Para", "PA");

    private String sigla;
    private String nome;
    private EstadoBrasileiro (String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
