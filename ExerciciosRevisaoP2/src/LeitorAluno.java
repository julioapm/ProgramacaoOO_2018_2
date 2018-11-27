import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeitorAluno {
    public static List<Aluno> lerArquivo(String path) throws IOException {
        List<Aluno> alunos = new ArrayList<>();
        Path caminho = Paths.get(path);
        try(BufferedReader entrada = Files.newBufferedReader(caminho)) {
            String linha = null;
            while ((linha = entrada.readLine()) != null) {
                String[] dados = linha.split(" ");
                Aluno aluno = new Aluno(dados[0]);
                for(int i=1; i<dados.length; i++){
                    double nota = Double.parseDouble(dados[i]);
                    aluno.adicionarNota(nota);
                }
                alunos.add(aluno);
            }
        } catch (IOException e) {
            throw e;
        }
        return alunos;
    }
}
