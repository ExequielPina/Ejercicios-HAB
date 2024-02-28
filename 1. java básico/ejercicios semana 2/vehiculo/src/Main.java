import java.util.ArrayList;

public static void main(String[] args) {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();


    vehiculos.add(new Auto(1, "ABC123", "Tesla", "Model S", 2020, 80000, 10000, 10));
    vehiculos.add(new Camioneta(2, "DEF456", "Toyota", "Hilux", 2019, 50000, 80, 12));
    vehiculos.add(new Moto(3, "GHI789", "Honda", "CBR600RR", 2015, 10000, 600, "4 tiempos"));


    for (Vehiculo vehiculo : vehiculos) {
        System.out.println("ID: " + vehiculo.getId());
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Año: " + vehiculo.getAño());
        System.out.println("Costo: $" + vehiculo.getCosto());


        int antiguedad = vehiculo.calcularAntiguedad();
        System.out.println("Antigüedad: " + antiguedad + " años");


        if (vehiculo instanceof Electrico) {

            ((Electrico) vehiculo).cargarEnergia();
        }


        if (vehiculo instanceof Combustion) {

            ((Combustion) vehiculo).recargarCombustible();
        }

        System.out.println();
    }



