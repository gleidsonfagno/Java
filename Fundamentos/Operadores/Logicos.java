public class Logicos {
    public static void main(String[] args) {
        //  && operador logico "E"
        // || operador logico "OU"

        boolean valor1 = true;
        boolean valor2 = true;

        if (valor1 && valor2) {
            System.out.println("Os dois valores preciam ser verdadeiro");
        }

        if (valor1 || valor2) {
            System.out.println("So uma condição precisa ser verdadeira");
        }
    }
}
