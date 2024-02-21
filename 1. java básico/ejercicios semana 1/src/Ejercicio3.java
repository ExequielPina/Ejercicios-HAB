import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        System.out.print("Hola, vamos a calcular la base de un triangulo, ingresa su base");

        double base = scanner.nextDouble();

        System.out.print("ahora ingresa su altura");

        double altura = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        double area = (altura * base) / 2;

        String areaFormat = decimalFormat.format(area);

        System.out.print("El área del triangulo es: " + areaFormat);

    }
}
