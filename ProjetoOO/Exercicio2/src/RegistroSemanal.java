import java.time.DayOfWeek;
import java.time.Duration;

public class RegistroSemanal {
    private RegistroDiario[] registros;
    private static final DayOfWeek[] diasTrabalho = {DayOfWeek.MONDAY,DayOfWeek.TUESDAY,DayOfWeek.WEDNESDAY,DayOfWeek.THURSDAY,DayOfWeek.FRIDAY};
    public RegistroSemanal() {
        registros = new RegistroDiario[5];
    }

    public void adicionarRegistroDiario(RegistroDiario rd) {
        registros[rd.getData().getDayOfWeek().getValue()-1] = rd;
    }

    public RegistroDiario buscarRegistroDiario(DayOfWeek diaDaSemana) {
        return registros[diaDaSemana.getValue()-1];
    }

    public void limparRegistros() {
        for(int i=0; i<registros.length; i++) {
            registros[i] = null;
        }
    }

    public double horasDia(DayOfWeek diaDaSemana) {
        int posicao = diaDaSemana.getValue()-1;
        if (registros[posicao] != null) {
            RegistroDiario rd = registros[posicao];
            return rd.horasDia();
        } else {
            return 0;
        }
    }

    public double horasSemana() {
        double total = 0;

        for (DayOfWeek diaDaSemana : diasTrabalho) {
            total += horasDia(diaDaSemana);
        }
        return total;
    }
}
