import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Frase:");
        String texto = sc.nextLine();
        Set<String> unicos = new HashSet<>();
        Set<String> duplic = new HashSet<>();
        for (String a: texto.split(" ")) {
            if (!unicos.add(a)) {
                // Se já tem, adiciona nos duplicados
                duplic.add(a);
            }
        }
        // Remove do original os que também estão nos duplicados
        unicos.removeAll(duplic);
        System.out.println("Palavras não repetidas: " + unicos);
        System.out.println("Palavras repetidas: " + duplic);
    }
}
