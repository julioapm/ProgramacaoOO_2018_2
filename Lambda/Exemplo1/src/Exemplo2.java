import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class Exemplo2 {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Estudante 1",2015,8.5));
        estudantes.add(new Estudante("Estudante 2",2017,7.0));
        estudantes.add(new Estudante("Estudante 3",2015,9.5));

        double maiorNota =
                estudantes.stream().filter(new Predicate<Estudante>() {
                    @Override
                    public boolean test(Estudante estudante) {
                        return estudante.getAnoGraduacao() == 2015;
                    }
                }).mapToDouble(new ToDoubleFunction<Estudante>() {
                    @Override
                    public double applyAsDouble(Estudante estudante) {
                        return estudante.getNota();
                    }
                }).max().getAsDouble();

        System.out.println(maiorNota);
    }
}
