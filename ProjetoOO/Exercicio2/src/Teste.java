import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Teste {
    public static void main(String[] args) {
        //Inicialização do cadastro de funcionários para teste
        SistemaContabil sistema = new SistemaContabil();
        Funcionario func = new Funcionario("12345", "John Doe", LocalDate.now(), 65.50);
        sistema.adicionar(func);

        //Quando o funcionário chega para trabalhar
        func = sistema.buscarFuncionario("12345");
        if (func != null) {
            RegistroDiario reg = new RegistroDiario(LocalDate.of(2018,8,27), LocalTime.of(8,0));
            func.getRegistros().adicionarRegistroDiario(reg);
        }

        //Quando o funcionário sai do trabalho
        func = sistema.buscarFuncionario("12345");
        if (func != null) {
            RegistroDiario reg = func.getRegistros().buscarRegistroDiario(DayOfWeek.MONDAY);
            reg.setSaida(LocalTime.of(17,30));
        }

        //Calcular o total trabalho no dia
        System.out.println(sistema.calcularHorasDia("12345",DayOfWeek.MONDAY));

        //Calcular o total trabalho na semana
        System.out.println(sistema.calcularHorasSemana("12345"));

        //Calcular salário na semana
        System.out.println(sistema.calcularSalarioSemanal("12345"));
    }
}
