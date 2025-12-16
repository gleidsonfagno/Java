package TiposWrappers;

import java.util.Date;

public class TiposWrappers {
    public static void main(String[] args) {
        // Conversão de tipos esmplícita
        double numeroDouble = 123.34;
        int numeroInt =  (int) numeroDouble;
        System.out.println(numeroInt);

        // implícitas
        double  d = 100.2;
        int i = (int) d;
        System.out.println(i);

        // Wrapper
        Double n1 = 100.1;
        Integer n2 = n1.intValue(); // inteiro
        System.err.println(n2 + " Converso com Wrapper");

        String num = "100";
        int e = Integer.parseInt(num);
        System.err.println(e + " De stringn para numero Int" + "\n");

        String num2 = "100.321";
        Double e2 = Double.parseDouble(num2);
        System.err.println(e2);

        // Wrappers ção classes e classes tem metodos

        // Comparar obj
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");

        System.out.println(obj1.equals(obj2) + "\n");
        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj1 > obj2);

        // Tipos Customizados
        // Math, Gson

        // declaração e atribuição
        int idade;
        Date dataNacimento = new Date();
        System.out.println(dataNacimento);
        idade = 23;
    }

    // Padrão de escrita (sintaxe) e o método tem que ser um verbo 
    void saveUser() {}; // Metodos void não precisam de return
    int calculateTotal(Integer params1, Integer params2) {
        int obj1;
        return  obj1 = params1 + params2;
        // precisam do return
    };
    // Com parametros
    void sendEmail(String params){};

    public void processPayment() { } // throws Exception : Poderá gerar exceções

    // private void process() { }; // Não vai ser visto por outras classes
}
