import java.io.DataInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeBytes {
    public static void main(String[] args) {
        //Define o caminho para o arquivo
        Path caminho = Paths.get("teste.bin");
        //Cria um objeto DataInputStream sobre um InputStream para arquivo
        try (DataInputStream entrada = new DataInputStream(Files.newInputStream(caminho))) {
            int i = entrada.readInt();
            System.out.println(i);
            char c = entrada.readChar();
            System.out.println(c);
            String s = entrada.readUTF();
            System.out.println(s);
            System.out.println("Arquivo lido com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na leitura do arquivo.");
            e.printStackTrace();
        }
    }
}
