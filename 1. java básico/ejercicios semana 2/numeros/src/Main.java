import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 10, 36, 4, 56, 6, 96, 8, 70, 10 ));

        numeros.forEach(p -> System.out.println(p));
        List<Integer> mayores = numeros.stream()
                .filter(numero -> numero > 10).collect(Collectors.toList());


        System.out.println("Números mayores que 10: " + mayores);


    }
}