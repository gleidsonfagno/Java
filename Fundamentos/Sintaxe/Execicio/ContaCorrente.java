package Execicio;
// package Fundamentos;

import java.time.LocalDate;

public class ContaCorrente {

    int numeroConta = 458721;
    int numeroAgencia = 3021;
    String nomeDocliente = "Marcos Antônio Ribeiro";
    LocalDate dataNacimento  ;
    double saldoConta = 3275.00;
    boolean ativo = true;
    
    int numeroConta2 = 983512;
    int numeroAgencia2 = 1145;
    String nomeDocliente2 = "Carolina Mendes Silva";
    LocalDate dataNacimento2 ;
    double saldoConta2 = 10580.45;

    void ConsultarSaldoAtual(int params) {
        System.out.println("Exibir saldo atual");

        if (numeroConta == params) {
            System.out.println("Seu saldo");
            System.out.println(saldoConta);
        } else {
            System.out.println("Dados con conferem");
        }
    }

    void Sacar(double params) {
        System.out.println("Sacar dinherio");
        if (params != 0) {
            if (params > saldoConta) {
                System.out.println("O valor e mair do que tem na sua conta");
            } else {
                double newSaldo = saldoConta - params;
                System.out.println("Seu saldo agora !");
                System.err.println(newSaldo);
            }
        } else {
            System.out.println("O valor e inválido para sacar");
        }
    }

    void Tranfeir(double valor, int conta) {
        System.out.println("Tranferir dinherio para outra conta");

        if (valor != 0 ) {
            if (conta != numeroConta2 ) {
                System.out.println("Dados nao confere");
            }else{
                saldoConta2 += valor;
                saldoConta -= valor;
                
                System.out.println("Valo tranferido para a Carolina e" + valor);
                System.out.println("Valor da saldo da conta agora e " + saldoConta);
                System.out.println("Valor total da conta da Carolina " + saldoConta2);
            }
        }
    }

    void Cancelar(String params, int conta) {
        System.out.println("Cancelar Conta");

        System.out.println("Justifique o o motivo do cancelamento");

        if (conta == numeroConta) {
            System.out.println("A conta " + nomeDocliente + " foi Encerrada " + "Agencia: " + numeroAgencia + " Conta: " + numeroConta);
        }
    } 

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        System.out.println("         ");
        conta.ConsultarSaldoAtual(458721);
        System.out.println("         ");
        conta.Sacar(30);
        System.out.println("         ");
        conta.Tranfeir(300, 983512);
        System.out.println("         ");
        conta.Cancelar("Teste do metodo de cancelar", 458721);

    }

}