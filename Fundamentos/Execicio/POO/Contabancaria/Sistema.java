package Execicio.POO.Contabancaria;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;

public class Sistema {
    Scanner scanner = new Scanner(System.in);
//    variáveis clientes
    String nome ;
    Date dataNascimento =  new Date();
    String email;

//    variáveis conta bancaria
    String senha;
    Integer agencia = 1234 ;
    Integer conta = 56789;
    Double saldo = 0.0;
    Double chequeEspecial = 0.0;

    public void consultaSaldo() {

    }

    public void criarConta(  ) {

        do {
            try {
                System.out.println("Digite seu nome");
                this.nome = scanner.nextLine().trim();

                if (nome.length() <= 3){
                    throw new RuntimeException("Nome não pode ser menor que 3 caracteres");
                }

            }catch (RuntimeException e){
                System.out.println("Erro: " + e.getMessage());
                this.nome = "";
            }
        }while (nome.length() <= 3 );

        do {
            try {
                System.out.println("Digite seu email: ");
                this.email = scanner.nextLine().trim();

                if (!this.email.contains("@")){
                    throw new RuntimeException("Email inválido! deve conter `@` ");
                }

                if (!this.email.contains(".com")){
                    throw new RuntimeException("Email inválido! deve conter `.com` ");
                }
            }catch (RuntimeException e){
                System.out.println("Erro: " + e.getMessage());
                this.email = " ";
            }
        }while (!this.email.contains("@") || !this.email.contains(".com"));

        do {
            try {
                System.out.println("Digite sua Senha: ");
                this.senha = scanner.nextLine().trim();
                if (this.senha.length() <= 4) {
                    throw new RuntimeException("A senha dever conter mais de 4 caracteres");
                }
            } catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
                this.senha = "";
            }
        }while (this.senha.length() <= 4);


        System.out.println("\nCadastro concluído com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Cheque especial: " + chequeEspecial + "\n");

        Menu();

    }

    public void App() {

        int opcao = 1;
        do {
            System.out.println("1 - Consultar saldo\n" +
                    "2 - consultar cheque especial\n" +
                    "3 - Depositar dinheiro;\n" +
                    "4 - Sacar dinheiro;\n" +
                    "5 - Pagar um boleto.\n" +
                    "6 - Verificar se a conta está usando cheque especial. \n"+
                    "0 - Sair. \n"
            );
            try {
                 opcao = scanner.nextInt();
                 if (opcao < 0 || opcao > 6){
                     System.err.println("Erro: opção invalida, digite um número entre 0 e 6.");
                 }
            }catch (Exception e){
                System.err.println("Erro: Digite apenas números");
                scanner.next();
            }
        }while (opcao < 0 || opcao > 6);

        if (opcao == 5){
            Menu();
        }
        System.out.println("Você escolheu a opção: " + opcao);
    }

    public void Menu() {
        System.out.println("****** Baco Java  *****");
        System.out.println(" 1 Abrir conta \n" + " 2 logar na conta");

        int input = Integer.parseInt(scanner.nextLine());


        if (input == 1){
            System.out.println("1 Abrir conta \n");
            criarConta();
        }
        else if (input == 2) {
            System.out.println("Digite sua agência");
            Integer agenciaLogin = scanner.nextInt();
            if (agenciaLogin.equals(this.agencia)){
                System.out.println("Usuário: " + this.nome + " logado" );
                App();

            }

        }

    }


    public static void main(String[] args){
        Sistema conta = new Sistema();
        conta.Menu();
    }
}
