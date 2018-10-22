public class Produto implements Comparable<Produto>{
    private String codigo;
    private String nome;
    private double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[codigo=%s, nome=%s, preco=R$%.2f]",codigo,nome,preco);
    }

    @Override
    public boolean equals(Object obj) {
        //Dois produtos são iguais se possuem o mesmo código (que é único)
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Produto outro = (Produto) obj;
        return codigo.equals(outro.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public int compareTo(Produto o) {
        return codigo.compareTo(o.codigo);
    }
}
