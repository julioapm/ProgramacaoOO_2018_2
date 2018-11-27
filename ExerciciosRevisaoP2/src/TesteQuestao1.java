import java.util.ArrayList;
import java.util.List;

public class TesteQuestao1 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(new Ponto(1,1),1);
        Circulo c2 = new Circulo(new Ponto(1,1),2);
        Circulo c3 = new Circulo(new Ponto(3,3),3);
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(c1);
        circulos.add(c2);
        circulos.add(c3);
        try {
            SerializacaoCsvCirculo.serializar(circulos,"circulos.csv");
        } catch (Exception e) {
            System.out.println("Falha na escrita do arquivo CSV");
        }
    }
}
