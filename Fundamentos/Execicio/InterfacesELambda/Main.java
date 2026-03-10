package Execicio.InterfacesELambda;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GeometricForm geometricForm = null;
        int option = -1;

        while(option != 4) {
            System.out.println("Digite uma forma geometrica: ");
            System.out.println("1 - Quadrado \n2 - Circulo \n3 - Retângulo\n4 - Sair do programa");
            option = scanner.nextInt();
//            if (option == 1) {
//                geometricForm = createSquare();
//            }
            switch (option){
                case 1 -> {
                    geometricForm = createSquare();
                }
                case 2 -> {
                    geometricForm = createCircle();
                }
                case 3 -> {
                    geometricForm = createRectangle();
                }
                default -> {
                    break;
                }
            }
            assert geometricForm != null;
            System.out.println("O resultado do calculo da area foi de" + geometricForm.getArea() + "\n"
            );
        }
    }

    private static GeometricForm createSquare() {
        System.out.println("Digite o tamanho dos lados: ");
        double side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricForm  createRectangle() {
        System.out.println("Digite a altura e largura do retângulo: ");
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();
        return new Rectangle(height, width);
    }

    private static  GeometricForm createCircle() {
        System.out.println("Digite o tamanho do raio do circulo: ");
        double radius = scanner.nextDouble();
        return new Rectangle(radius, radius);
    }
}
