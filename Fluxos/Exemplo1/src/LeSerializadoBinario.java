import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class LeSerializadoBinario {
    public static void main (String[] args) {
        Path caminho = Paths.get("objeto.bin");
        try (ObjectInputStream entrada = new ObjectInputStream(Files.newInputStream(caminho))) {
            LocalDate obj = (LocalDate) entrada.readObject();
            System.out.println(obj);
            System.out.println("Arquivo lido com sucesso.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Falha na leitura do arquivo.");
            e.printStackTrace();
        }
    }
}
