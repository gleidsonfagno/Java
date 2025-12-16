package JavaBeans;
public class JavaBeans {
    // para ser constante tem qquue  tem o Final com leetras maiscula NATA_MINIMA

    // getters e Setters 
    public static void main(String[] args) {
        Alunos felipe = new Alunos();
        felipe.setNome("felipe");
        felipe.setIdade(-1);
        felipe.getNome();
        felipe.getIdade();

        System.out.println(felipe.getNome() + felipe.getIdade());
    }
}
