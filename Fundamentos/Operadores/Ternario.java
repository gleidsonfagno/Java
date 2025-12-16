public class Ternario {
    public static void main(String[] args) {
        // ternario e uma forma resumida  ? :
        int  idade= 19;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        System.out.println("Iza" + (maiorIdade ?  " é maior de idade": " não e maiorde idade"));
    }
}
