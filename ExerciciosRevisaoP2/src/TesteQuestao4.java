public class TesteQuestao4 {
    public static void main (String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.add(new Funcionario("Funcionario 1", "Gerente"));
        cadastro.add(new Funcionario("Funcionario 2", "Gerente"));
        cadastro.add(new Funcionario("Funcionario 3", "Vendedor"));
        cadastro.add(new Funcionario("Funcionario 4", "Representante"));
        cadastro.exibeTotalPorCargo();
    }
}
