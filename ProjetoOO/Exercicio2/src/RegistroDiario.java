import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class RegistroDiario {
    private LocalDate data;
    private LocalTime entrada;
    private LocalTime saida;

    public RegistroDiario(LocalDate d, LocalTime e) {
        data = d;
        entrada = e;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getEntrada() {
        return entrada;
    }

    public LocalTime getSaida() {
        return saida;
    }

    public void setSaida(LocalTime s) {
        saida = s;
    }

    public double horasDia() {
        Duration diferenca = Duration.between(entrada,saida);
        double minutos = diferenca.toMinutes();
        return minutos/60;
    }
}
