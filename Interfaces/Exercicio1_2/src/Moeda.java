public class Moeda implements Comparable<Moeda>{
    private double valor;
    private String nome;

    @Override
    public int compareTo(Moeda o) {
        if (valor < o.valor) return -1;
        if (valor > o.valor) return 1;
        return 0;
    }

    public Moeda(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

}

