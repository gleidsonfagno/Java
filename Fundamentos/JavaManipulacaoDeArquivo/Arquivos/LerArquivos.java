package JavaManipulacaoDeArquivo.Arquivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LerArquivos {
    public static void main(String[] args) {
        var nomeArquivo = "./JavaManipulacaoDeArquivo/mi-arquivo.txt";
        var arquivo = new File(nomeArquivo);

        try {
            System.out.println("Conteúdo do Arquivo!: ");
            // Abrir o arquivo;
            var entrada = new BufferedReader(new FileReader(arquivo));
            // Lemos linha a linha;
            String linha = entrada.readLine();
            // Lemos todas as linhas
            while (linha != null) {
                System.out.println(linha);
                // antes de terminar o ciclo, nos movemos a seguinte linha
                linha = entrada.readLine();
            }
            // fechar o arquivo
            entrada.close();
        }catch (Exception e){
            System.out.println("Erro ao ler arquivo!");
        }
    }
}
