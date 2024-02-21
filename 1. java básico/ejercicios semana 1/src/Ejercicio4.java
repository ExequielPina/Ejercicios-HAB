import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int sum, rest, mult, div;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero");
        int  numero1 = scanner.nextInt();
        System.out.print("Ingresa un segundo número entero");
        int  numero2 = scanner.nextInt();

        sum   =  numero1 + numero2;
        rest  =  numero1 - numero2;
        mult  =  numero1 * numero2;
        div   =  numero1 / numero2;

        System.out.print("La suma de esos números es: " + sum + " La division es: " + div + " La resta es: " + rest + " La mult. es: " + mult);

    }
}
