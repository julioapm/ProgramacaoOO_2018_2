import java.time.LocalDate;

public class Funcionario {
    private String codigo;
    private String nome;
    private LocalDate dataContratacao;
    private double salarioHora;
    private RegistroSemanal registros;

    public Funcionario(String umCodigo, String umNome, LocalDate umaData, double umSalario) {
        codigo = umCodigo;
        nome = umNome;
        dataContratacao = umaData;
        salarioHora = umSalario;
        registros = new RegistroSemanal();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public RegistroSemanal getRegistros() {
        return registros;
    }
}
