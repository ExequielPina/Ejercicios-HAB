import java.util.Scanner;

public class Ejercicio1Dia3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad");

        int edad = scanner.nextInt();

        if(edad >= 18){
            System.out.print("Puedes ingresar al recital");
        }else {
            System.out.print("NO puedes ingresar al recital");
        }
    }
}
