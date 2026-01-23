package Execicio.POO.Contabancaria;

import javax.swing.*;

public class ContaBancaria {
    private Double saldo;
    private Double chequeEspecial;
    private final int agencia;
    private final int conta;
    private Double chequeEspecialUsado = 0.0;

    public ContaBancaria(Double saldo, Integer agencia, Integer conta){
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;

        if (saldo <= 500){
            this.chequeEspecial = 50.0;
        }else {
            this.chequeEspecial = saldo * 0.5;
        }
    }

    public Double getChequeEspecial() {
        return chequeEspecial;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getConta() {
        return conta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void depositar( Double valor){
         this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }

    public void pagarBoleto(Double valor) {
        if (valor <= saldo){
            this.saldo -= valor;
            System.out.println("boleto pago com sucesso");
        }else if (valor <= (this.saldo + this.chequeEspecial)) {
            double usoCheque = valor - this.saldo;
            this.chequeEspecialUsado += usoCheque;
            this.chequeEspecial -= usoCheque;
            this.saldo -= this.saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public Boolean estaUsandoChequeEspecial(){
        return saldo < 0;
    }
}
