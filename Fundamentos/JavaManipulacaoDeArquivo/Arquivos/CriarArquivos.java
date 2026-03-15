package JavaManipulacaoDeArquivo.Arquivos;

import java.io.*;

public class CriarArquivos {
    public static void main(String[] args) throws IOException {
        var nomeArquivo = "./JavaManipulacaoDeArquivo/mi-arquivo.txt";
        var arquivo = new File(nomeArquivo);
        try {
            if (arquivo.exists()) {
                System.out.println("Arquivo já existe!");
            } else {
                // cria o arquivo
                var saida = new PrintWriter(new FileWriter(arquivo));
                // salva no disco rígido
                saida.close();
                System.out.println("Arquivo criado com sucesso!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo!" + e.getMessage());
            e.printStackTrace();
        }
    }
}
