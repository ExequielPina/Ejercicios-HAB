public class Main {


    public static void main(String[] args) {
        System.out.println("hilo principal");

        Hilo hilo1 = new Hilo(8, "Pepe");
        Hilo hilo2 = new Hilo(9, "Chopapo");


        hilo1.start();
        hilo2.start();

    }


}