import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionar(Moeda umaMoeda){
        moedas.add(umaMoeda);
    }

    public Moeda menorMoedaV2() {
        return Collections.min(moedas);
    }

    public Moeda menorMoeda(){
        if (moedas.isEmpty()) {
            return null;
        }
        Moeda menor = moedas.get(0);
        for(Moeda m : moedas){
            if (m.getValor() < menor.getValor()){
                menor = m;
            }
        }
        return menor;
    }

    public double menorValorMoeda(){
        double menor = moedas.get(0).getValor();
        for(Moeda m : moedas){
            if (m.getValor() < menor) {
                menor = m.getValor();
            }
        }
        return menor;
    }

    public int contarMoedasValor(double umValor){
        int contador = 0;
        for(Moeda m : moedas){
            if (m.getValor() == umValor) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularTotal() {
        double total = 0;
        for(Moeda m : moedas) {
            total += m.getValor();
        }
        return total;
    }
}
