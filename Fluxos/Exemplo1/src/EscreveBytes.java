import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscreveBytes {
    public static void main(String[] args) {
        //Define o caminho para o arquivo
        Path caminho = Paths.get("teste.bin");
        //Cria um objeto DataOutputStream sobre um OutputStream para arquivo
        try(DataOutputStream saida = new DataOutputStream(Files.newOutputStream(caminho))) {
            //Escreve um número inteiro
            saida.writeInt(1);
            //Escreve um caractere
            saida.writeChar('a');
            //Escreve uma string
            saida.writeUTF("ab");
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo.");
            e.printStackTrace();
        }
    }
}
