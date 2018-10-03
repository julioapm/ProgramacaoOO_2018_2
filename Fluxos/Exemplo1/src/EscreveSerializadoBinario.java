import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class EscreveSerializadoBinario {
    public static void main(String[] args) {
        Path caminho = Paths.get("objeto.bin");
        try (ObjectOutputStream saida = new ObjectOutputStream(Files.newOutputStream(caminho))) {
            LocalDate obj = LocalDate.now();
            saida.writeObject(obj);
            System.out.println("Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("Falha na escrita do arquivo.");
            e.printStackTrace();
        }
    }
}
