public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Electrodomestico [] arrayElectrodomesticos = new Electrodomestico[3];

        arrayElectrodomesticos[0] = new Electrodomestico(1, "Samsung", "s-100", 100, "Negro");
        arrayElectrodomesticos[1]  = new Electrodomestico(2, "Xiaomi", "Ultra", 5, "Gris");
        arrayElectrodomesticos[2]  = new Electrodomestico(3, "LG", "100N", 20, "Blanco");

        //arrayElectrodomesticos[4]  = new Electrodomestico();





       for(int i =0; i< arrayElectrodomesticos.length; i++){
            Electrodomestico electrodomestico = arrayElectrodomesticos[i];
            System.out.println(electrodomestico.getColor());
       }

    }
}