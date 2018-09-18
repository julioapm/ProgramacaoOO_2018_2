import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda umaMoeda){
        moedas.add(umaMoeda);
    }

    public double calcularTotal() {
        double total = 0;
        for(Moeda m : moedas) {
            total += m.getValor();
        }
        return total;
    }
}
