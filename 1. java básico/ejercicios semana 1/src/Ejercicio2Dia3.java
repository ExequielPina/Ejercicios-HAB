import java.util.Scanner;

public class Ejercicio2Dia3 {
    public static void main(String[] args) {
        int total =0;
        int producto;
        boolean ward = true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el precio de un producto y cero para finalizar");
        producto = scanner.nextInt();
        while (producto > 0){

        total += producto;

        System.out.print("Ingresa el precio de un producto y cero para finalizar");
        producto = scanner.nextInt();

        }
        System.out.print("Precio total: " + total);
    }
}
