import java.util.*;

public class Cadastro {
    private List<Funcionario> lista = new ArrayList<>();
    public void add(Funcionario funcionario) {
        lista.add(funcionario);
    }
    public void exibeTotalPorCargo() {
        Map<String,List<Funcionario>> mapa = new HashMap<>();
        for (Funcionario f : lista) {
            String cargo = f.getCargo();
            if (mapa.containsKey(cargo)) {
                mapa.get(cargo).add(f);
            }
            else {
                List<Funcionario> funcs = new LinkedList<>();
                funcs.add(f);
                mapa.put(cargo, funcs);
            }
        }
        mapa.forEach((cargo,funcs) -> System.out.println(cargo + " : " + funcs.size()));
    }
}
