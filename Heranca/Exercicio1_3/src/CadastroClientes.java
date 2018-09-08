import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> clientes;

    public void adicionar(Cliente c) {
        clientes.add(c);
    }

    public String getListagemClientes() {
        StringBuilder listao = new StringBuilder();
        for(Cliente c : clientes) {
            listao.append(String.format("Nome: %s Mensalidade: %.2f%n", c.getNome(), c.getMensalidade()));
        }
        return listao.toString();
    }
}
