public class Produto implements Comparable<Produto>{
    private String nome;
    private long codigo;

    public Produto(String n, long c) {
        nome = n;
        codigo = c;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " #" + codigo;
    }

    @Override
    public int compareTo(Produto o) {
        if (codigo < o.codigo) return -1;
        if (codigo > o.codigo) return 1;
        return 0;
    }
}
