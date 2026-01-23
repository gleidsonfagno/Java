package Execicio.POO.Petshop;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet ");
            System.out.println("2 - Abastecer a máquina com água ");
            System.out.println("3 - Abastecer a máquina com shampoo ");
            System.out.println("4 - Verificar água da máquina ");
            System.out.println("5 - Verificar água da máquina ");
            System.out.println("6 - Verificar se tem pet no banho ");
            System.out.println("7 - Colocar o pet na máquina ");
            System.out.println("8 - Retirar o pet da máquina ");
            System.out.println("9 - Limpar a maquina  ");
            System.out.println("0 - Sair ");
            option = scanner.nextInt();
        }while (option != 0);


    }

    public void setPetIntPetMachine() {
        System.out.println("Informe");
    }
}
//34