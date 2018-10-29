import java.util.Arrays;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 3, 5, 0, 6, 2, 1);
        int max = numbers.stream()
                .reduce((x,y)->{
                    if(x>y) return x;
                    return y;
                })
                .get();
        System.out.println(max);
    }
}
