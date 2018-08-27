import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("Antonio", 30);
        pessoas[1] = new Pessoa("Carla", 24);
        pessoas[2] = new Pessoa("Bruno", 26);

        System.out.println("Antes de ordenar:");
        for(Pessoa p : pessoas) {
            System.out.println(p);
        }

        Arrays.sort(pessoas);

        System.out.println("Depois de ordenar:");
        for(Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
