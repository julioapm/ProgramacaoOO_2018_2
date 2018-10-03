import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeTexto {
    public static void main(String[] args) {
        //Define o caminho para o arquivo
        Path caminho = Paths.get("teste.txt");
        try(BufferedReader entrada = Files.newBufferedReader(caminho)) {
            String linha = null;
            while ((linha = entrada.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("Arquivo lido com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na leitura do arquivo.");
            e.printStackTrace();
        }
    }
}
