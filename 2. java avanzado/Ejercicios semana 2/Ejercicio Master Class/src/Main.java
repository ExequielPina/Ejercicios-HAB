import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>(getVehiculos());

        System.out.println("Ejercicio 1");

        // método para ordena por medio del metodo Sort que ordena por precio ascendente
//        vehiculos.sort((vehiculo1, vehiculo2) -> (int) (vehiculo1.getPrecio() - vehiculo2.getPrecio()));
//        vehiculos.sort(Comparator.comparingDouble(vehiculo -> vehiculo.getPrecio()));
        vehiculos.sort(Comparator.comparingDouble(Vehiculo::getPrecio)); // sort metodo comparador
        vehiculos.forEach(System.out::println); // recorre lista ordenada

        System.out.println("Ejercicio 2");

        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getPrecio))
                .forEach(System.out::println);



        System.out.println("Ejercicio 3");

        List<Vehiculo> vehiculosMenores = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() < 1000 )
                .collect(Collectors.toList());

        List<Vehiculo> vehiculosMayores = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() >= 1000 )
                .collect(Collectors.toList());


        double media = vehiculos.stream()
                .mapToDouble(Vehiculo::getPrecio)
                .average()
                .orElse(0);

        System.out.println(media);
    }

    private static List<Vehiculo> getVehiculos() {
        return List.of(
                new Vehiculo("Mazda", "Fiesta", 2000.0),
                new Vehiculo("mitsubish", "Focus", 2200.0),
                new Vehiculo("Toyota", "Explorer", 3500.0),
                new Vehiculo("Lexus", "Uno", 600.0),
                new Vehiculo("Fiat", "Cronos", 2000.0),
                new Vehiculo("Lexus", "Torino", 2250.0),
                new Vehiculo("Mazda", "Aveo", 3250.0),
                new Vehiculo("Mazda", "Spin", 1500.0),
                new Vehiculo("Toyota", "Corolla", 2200.0),
                new Vehiculo("mitsubish", "Fortuner", 4000.0),
                new Vehiculo("Lexus", "Logan", 150.0)

        );
    

    }
}

//3. Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtén una lista de vehículos
// ordenados por precio de menor a mayor, imprime por pantalla el resultado.
//
// 4. De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
//
//5. Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios
// mayor o igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
//

