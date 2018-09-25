import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogo {
    private List<Produto> produtos;

    public Catalogo(){
        produtos = new ArrayList<>();
    }

    public void cadastrar(Produto p){
        produtos.add(p);
    }

    public int quantidade(){
        return produtos.size();
    }

    public void ordenarCodigo() {
        Collections.sort(produtos);
    }
}
