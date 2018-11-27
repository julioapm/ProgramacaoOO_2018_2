import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class Person {
    public enum Genero {
        MASC, FEM
    }
    private String nome;
    private LocalDate nasc;
    private Genero genero;
    private String email;

    public Person(String nome, LocalDate nasc, Genero genero, String email) {
        this.nome = nome;
        this.nasc = nasc;
        this.genero = genero;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return nasc.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }
}
