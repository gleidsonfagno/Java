package ControleDeFluxo.Repeticao;

public class RepeticaoFor {
    public static void main(String[] args) {
        String[] alunos = {"Felipe", "Jonas", "Rafale", "Leyde", "Natanael", "Luna"};
        //  for (para)
        for (int carneirinhos = 1; carneirinhos <= 2; carneirinhos ++){
            System.out.println("Carneirinhos: " + carneirinhos);
        }

        for (int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i] + i);
            if (alunos[i] == "Jonas"){
                System.out.println("execução apos a regra");
                continue;
            }
        }

        for ( String aluno : alunos ){
            System.out.println("Aluno: " + aluno);
            if (aluno.equals("Leyde")){
                System.out.println(aluno);
                break;
            }
        }


    }
}
