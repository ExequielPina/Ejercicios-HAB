import java.util.Scanner;

public class Meteorologia {
    public static void main(String[] args) {

        double sumatemperaturas =0;
        double temperaturaIngresada =0;
        int contador =0;
        Scanner scanner = new Scanner(System.in);

        while (contador < 7){
            System.out.println("Ingresa una temperatura");
            temperaturaIngresada = scanner.nextInt();
            contador++;

            sumatemperaturas += temperaturaIngresada;




        }
        System.out.println("La media de los últimos 7 dias es:  " + sumatemperaturas/7);


    }



}
