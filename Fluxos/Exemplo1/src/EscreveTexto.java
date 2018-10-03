import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreveTexto {
    public static void main(String[] args) {
        //Define o caminho para o arquivo
        Path caminho = Paths.get("teste.txt");
        //Cria um objeto PrintWriter sobre um Writer para arquivo
        try(PrintWriter saida = new PrintWriter(Files.newBufferedWriter(caminho))) {
            //Escreve um número inteiro
            saida.print(1);
            //Escreve um caractere
            saida.print('a');
            //Escreve uma string
            saida.print("ab");
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo.");
            e.printStackTrace();
        }
    }
}
