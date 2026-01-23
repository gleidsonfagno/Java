package Execicio.POO.Contabancaria;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class BankingSystem {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    Random random = new Random();

    private Cliente cliente;
    ContaBancaria contaBancaria;

    public void criarConta(  ) {
        String nome;
        String email;
        String password;

        Double saldo = null;
        int agencia = 100000 + random.nextInt(900000);
        int conta = 100000 + random.nextInt(900000);

        do {
            try {
                System.out.println("Digite seu nome");
                nome = scanner.nextLine().trim();

                if (nome.length() <= 3){
                    throw new RuntimeException("Nome não pode ser menor que 3 caracteres");
                }

            }catch (RuntimeException e){
                System.err.println("Erro: " + e.getMessage());
                nome = "";
            }
        }while (nome.length() <= 3 );

        do {
            try {
                System.out.println("Digite seu email: ");
                email = scanner.nextLine().trim();

                if (!email.contains("@")){
                    throw new RuntimeException("Email inválido! deve conter `@` ");
                }

                if (!email.contains(".com")){
                    throw new RuntimeException("Email inválido! deve conter `.com` ");
                }
            }catch (RuntimeException e){
                System.err.println("Erro: " + e.getMessage());
                email = " ";
            }
        }while (!email.contains("@") || !email.contains(".com"));

        do {
            try {
                System.out.println("Digite sua Senha: ");
                password = scanner.nextLine().trim();
                if (password.length() <= 4) {
                    throw new RuntimeException("A senha dever conter mais de 4 caracteres");
                }
            } catch (RuntimeException e) {
                System.err.println("Erro: " + e.getMessage());
                password = "";
            }
        }while (password.length() <= 4);

        do {
            try {
                System.out.println("Digite o valor do deposito");
                saldo = scanner.nextDouble();
                if (saldo <= 0){
                    System.err.println("Erro: valor deve ser maior que zero");
                    saldo = null;
                }

            }catch (Exception e){
                System.err.println("Erro: digite apenas números");
                scanner.next();
            }
        }while (saldo == null);


        this.cliente = new Cliente(nome, email, password);
        this.contaBancaria = new ContaBancaria(saldo, agencia, conta);
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Conta : " + this.contaBancaria.getConta() + "\n" +
                            "Agência : " + this.contaBancaria.getAgencia() + "\n"
        );

    }

    public void logar() {

        System.out.println("Digite sua agência");
        Integer agencia = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Digite sua senha");
        String password = scanner.nextLine().trim();

        if (this.contaBancaria != null && this.contaBancaria.getAgencia().equals(agencia) && this.cliente.getPassword().equals(password)){
            System.out.println("Usuário logado com sucesso!");
            app();
        } else {
            System.out.println("Dados inválido");
        }

    }

    public void menu() {
        int opcao = -1;

        do{
            System.out.println("\n****** Banco Java ******");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Logar");
            System.out.println("0 - Sair");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Digite apenas numero.");
                continue;
            }
            switch (opcao){
                case 1:{
                    criarConta();
                    break;
                } case 2: {
                    logar();
                    break;
                } case 0: {
                    System.out.println("Encerrando o sistema.");
                    break;
                } default:{
                    System.out.println("Opção inválida \n.");
                }

            }
        }while (opcao != 0);
    }

    public void app() {

        int opcao = -1;
        do {
            System.out.println("\n1 - Consultar saldo\n" +
                    "2 - consultar cheque especial\n" +
                    "3 - Depositar dinheiro;\n" +
                    "4 - Sacar dinheiro;\n" +
                    "5 - Pagar um boleto.\n" +
                    "6 - Verificar se a conta está usando cheque especial. \n"+
                    "0 - Sair.\n"
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


        if (opcao == 1) {
            System.out.println(contaBancaria.getSaldo() + "\n");
            app();
        }else if (opcao == 2){
            System.out.println(contaBancaria.getChequeEspecial() + "\n");
            app();
        }else if (opcao == 3){
            Double valor = null;
            do {
                try {
                    System.out.println("Digite o valor do deposito");
                    valor = scanner.nextDouble();
                    if (valor <= 0){
                        System.err.println("Erro: valor deve ser maior que zero");
                        valor = null;
                    }

                }catch (Exception e){
                    System.err.println("Erro: digite apenas números");
                    scanner.next();
                }
            }while (valor == null);

            contaBancaria.depositar(valor);
            System.out.println("Depósito no valor de " + valor + " realizado com sucesso" );
            app();
        }else if (opcao == 4){
            Double valor = null;
            String password = null;
            do {
                try {
                    System.out.println("Digite o valor do saque");
                    valor = scanner.nextDouble();
                    if (valor <= 0){
                        System.err.println("Erro: valor deve ser maior que zero");
                        valor = null;
                    }else if (valor > this.contaBancaria.getSaldo()){
                        System.err.println("Erro: valor do saque e maior que o da sua conta");
                        valor = null;
                    }

                }catch (Exception e){
                    System.err.println("Erro: digite apenas números");
                    scanner.next();
                }
            }while (valor == null);

            scanner.nextLine();

            do {
                try {
                    System.out.println("Digite a senha");
                    password = scanner.nextLine().trim();
                    if (!password.equals(this.cliente.getPassword())){
                        System.err.println("Erro senha inválida \n");
                    }
                } catch (IllegalArgumentException  e) {
                    System.err.println("Erro senha inválida \n");
                    scanner.next();
                }
            }while (!this.cliente.getPassword().equals(password));

            System.out.println("Saque de " + valor + " realisado com sucesso ");
            this.contaBancaria.sacar(valor);
            app();
        }else if(opcao == 5) {
            Double valor = null;
            String password = null;
            do {
                try {
                    System.out.println("Digite o valor do boleto");
                    valor = scanner.nextDouble();
                    if (valor <= 0){
                        System.err.println("Erro: valor deve ser maior que zero");
                        valor = null;
                    }

                } catch (Exception e) {
                    System.err.println("Erro: digite apenas números");
                    scanner.next();
                }

            }while (valor == null);

            scanner.nextLine();

            do {
                try {
                    System.out.println("Digite a senha");
                    password = scanner.nextLine().trim();
                    if (!password.equals(this.cliente.getPassword())){
                        System.err.println("Erro: senha inválida \n");
                    }
                } catch (IllegalArgumentException  e) {
                    System.err.println("Erro: senha inválida \n");
                }
            }while (!this.cliente.getPassword().equals(password));

            this.contaBancaria.pagarBoleto(valor);

            app();
        } else if (opcao == 6) {
           System.out.println(this.contaBancaria.estaUsandoChequeEspecial());
            app();
        } else {
           System.out.println("Você escolheu a opção: \n" + opcao);
           System.out.println("Saído do app ....\n");

        }

    }



    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.menu();
    }
}
