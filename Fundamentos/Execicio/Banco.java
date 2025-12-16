package Execicio;

// import java.util.List;

import java.time.LocalDate;

public class Banco {
    Integer numero;
    Integer agencia;
    String nomeClient;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double ConsultarSaldo(){
        return saldo;
    }

    // List consultarExtrato (LocalDate dataInicial, LocalDate dataFinal){
    //     return ??;
    // }

    void cancelar (String justificativa){
        //logica
    }

    void tranferir (Integer ContaCorrente, Integer ContaDestino, Double valorTranferido ){
        // logica
    }

    void sacar(Double valorSolicitado){
        //logica
    }
}
