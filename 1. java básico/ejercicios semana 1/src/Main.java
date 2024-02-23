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
            System.out.println( "Marca:  " + electrodomestico.getMarca() + "  Modelo:  " + electrodomestico.getModelo() + "  Consumo: " + electrodomestico.getConsumo());
       }



        Persona [] arrayPersonas = new Persona[5];

        arrayPersonas[0] = new Persona(1, "Daniel", 32, "Avenida Málaga", 63525441);
        arrayPersonas[1] = new Persona(2, "Pedro", 12, "Avenida Málaga", 63525441);
        arrayPersonas[2] = new Persona(3, "Jorge", 44, "Avenida Málaga", 63525441);
        arrayPersonas[3] = new Persona(4, "Manuel", 76, "Avenida Málaga", 63525441);
        arrayPersonas[4] = new Persona(5, "Miguel", 34, "Avenida Málaga", 63525441);




        arrayPersonas[0].setNombre("Luis");
        arrayPersonas[2].setNombre("raul");

        System.out.println("Nombre: " + arrayPersonas[0].getNombre() + ", Edad: " + arrayPersonas[0].getEdad());
        System.out.println("Nombre: " + arrayPersonas[2].getNombre() + ", Edad: " + arrayPersonas[2].getEdad());

        for (Persona persona : arrayPersonas ) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }

        for(Persona persona : arrayPersonas ){
            System.out.println("Nombre: " + persona.getNombre() +" Mayor de 30"  + ", Edad: " + persona.getEdad());
        }

    }







}