import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        notas = new ArrayList<>();
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return Collections.unmodifiableList(notas);
    }

    public double getMediaNotas() {
        double media = 0.0;
        for(double n : notas) {
            media += n;
        }
        return media/notas.size();
    }
}
