import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, LocalDate dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "[validade=" + dataValidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        ProdutoPerecivel outro = (ProdutoPerecivel) obj;
        return dataValidade.equals(outro.dataValidade);
    }
}
