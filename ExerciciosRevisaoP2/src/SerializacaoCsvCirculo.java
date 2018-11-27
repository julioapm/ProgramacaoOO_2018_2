import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SerializacaoCsvCirculo {
    public static void serializar(List<Circulo> colecao, String path) throws IOException {
        Path caminho = Paths.get(path);
        try(PrintWriter saida = new PrintWriter(Files.newBufferedWriter(caminho))) {
            for (Circulo c : colecao) {
                saida.print(c.getCentrox());
                saida.print(",");
                saida.print(c.getCentroy());
                saida.print(",");
                saida.println(c.getRaio());
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
