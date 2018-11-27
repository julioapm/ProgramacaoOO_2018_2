import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteQuestao3 {
    public static void main(String[] args) {
        List<Person> pessoas = new ArrayList<>();
        pessoas.add(new Person("Pessoa 1", LocalDate.of(1980,1,1), Person.Genero.MASC,"email@aqui.com"));
        pessoas.add(new Person("Pessoa 2", LocalDate.of(1990,1,1), Person.Genero.FEM,"email@aqui.com"));
        pessoas.add(new Person("Pessoa 3", LocalDate.of(2000,1,1), Person.Genero.MASC,"email@aqui.com"));
        pessoas.add(new Person("Pessoa 4", LocalDate.of(2000,1,1), Person.Genero.FEM,"email@aqui.com"));

        //nome das pessoas maiores de 18 anos
        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .sorted(Comparator.comparing(p -> p.getNome()))
                .forEach(p -> System.out.println(p.getNome()));







        //medida de idade dos homens
        double media = pessoas.stream()
                .filter(p -> p.getGenero() == Person.Genero.MASC)
                .mapToInt(Person::getIdade)
                .average()
                .getAsDouble();
        System.out.println(media);
    }
}
