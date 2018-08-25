import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class SistemaContabil {
    private Funcionario[] funcionarios;
    private int numeroFuncionarios;
    private static final int TAMANHO_INICIAL = 50;

    public SistemaContabil() {
        funcionarios = new Funcionario[TAMANHO_INICIAL];
        numeroFuncionarios = 0;
    }

    public void adicionar(Funcionario f) {
        if (numeroFuncionarios == funcionarios.length) {
            Funcionario[] novoArray = Arrays.copyOf(funcionarios, funcionarios.length*2);
            funcionarios = novoArray;
        }
        funcionarios[numeroFuncionarios] = f;
        numeroFuncionarios++;
    }

    public Funcionario buscarFuncionario(String codigo) {
        for(int i=0; i<numeroFuncionarios; i++) {
            if (funcionarios[i].getCodigo().equals(codigo)) {
                return funcionarios[i];
            }
        }
        return null;
    }

    public double calcularHorasDia(String codigo, DayOfWeek diaDaSemana) {
        Funcionario func = buscarFuncionario(codigo);
        if (func != null) {
            return func.getRegistros().horasDia(diaDaSemana);
        } else {
            return -1;
        }
    }

    public double calcularHorasSemana(String codigo) {
        Funcionario func = buscarFuncionario(codigo);
        if (func != null) {
            return func.getRegistros().horasSemana();
        } else {
            return -1;
        }
    }

    public double calcularSalarioSemanal(String codigo) {
        Funcionario func = buscarFuncionario(codigo);
        if (func != null) {
            return func.getSalarioHora()*func.getRegistros().horasSemana();
        } else {
            return -1;
        }
    }
}
