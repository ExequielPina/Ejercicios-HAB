import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hola, bienvenido al sistema. ");
        System.out.print(" ¿Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.print("Hola," + nombre +  " bienvenido al sistema.");

    }
}
