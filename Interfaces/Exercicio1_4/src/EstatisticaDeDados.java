import java.util.ArrayList;
import java.util.List;

public class EstatisticaDeDados {
    private double somatorio;
    private int quantidade;
    private double menor = Double.POSITIVE_INFINITY;
    private double maior = Double.NEGATIVE_INFINITY;

    public void adicionar(Mensuravel objeto) {
        double valor = objeto.getValor();
        somatorio += valor;
        quantidade++;
        if (valor < menor) menor = valor;
        if (valor > maior) maior = valor;
    }

    /**
     * Calcula a média dos valores
     * É necessário ter pelo menos um valor
     * @return a média dos valores
     */
    public double getMedia(){
        return somatorio/quantidade;
    }

    public double getMaior() {
        return maior;
    }

    public double getMenor() {
        return menor;
    }

    private List<Mensuravel> dados = new ArrayList<>();
    public void adicionarV2(Mensuravel objeto) {
        dados.add(objeto);
    }
    public double getMediaV2() {
        double somatorio = 0;
        for (Mensuravel m : dados) {
            somatorio += m.getValor();
        }
        return somatorio/dados.size();
    }












}
