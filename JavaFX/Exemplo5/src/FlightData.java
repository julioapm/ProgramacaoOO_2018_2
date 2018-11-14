import java.util.List;
import java.util.LinkedList;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class FlightData{
    private static FlightData fd = new FlightData();
    
    private List<String> cidadesAtendidas;
    private List<Integer> qtdadeAssentos;
    
    private List<String> loadCidadesAtendidas(){
        List<String> lst = new LinkedList<String>();
        lst.add("Porto Alegre");
        lst.add("Florianopolis");
        lst.add("Curitiba");
        lst.add("São Paulo");
        lst.add("Rio de Janeiro");
        lst.add("Brasilia");
        lst.add("Belo Horizonte");
        return lst;
    }
    
    private List<Integer> loadQtdadeAssentos(){
        List<Integer> lst = new LinkedList<>();
        for(int i=1;i<10;i++){
            lst.add(i);
        }
        return lst;
    }
    
    private FlightData(){
        cidadesAtendidas = loadCidadesAtendidas();
        qtdadeAssentos = loadQtdadeAssentos();
    }
    
    public static FlightData getInstance(){
        return(fd);
    }
    
    public ObservableList getCidadesAtendidas(){
        return FXCollections.observableList(cidadesAtendidas);
    }

    public ObservableList getQtdadeAssentos(){
        return FXCollections.observableList(qtdadeAssentos);
    }
    
}
