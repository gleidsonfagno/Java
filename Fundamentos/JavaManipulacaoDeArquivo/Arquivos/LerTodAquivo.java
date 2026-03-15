package JavaManipulacaoDeArquivo.Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LerTodAquivo {
    public static void main(String[] args) {
        var nomeArquivo = "./JavaManipulacaoDeArquivo/mi-arquivo.txt";

        try {
            // Ler todas as linhas do arquivo
            List<String> linhas = Files.readAllLines(Paths.get(nomeArquivo));

            System.out.println("Contúdo do  arquivo: " + nomeArquivo);
//            for (String linha : linhas) {
//                System.out.println(linha);
//            }
            linhas.forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Erro ao ler o arquivo"  + e.getMessage());
            e.printStackTrace();
        }
    }
}
