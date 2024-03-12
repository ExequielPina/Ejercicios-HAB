import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        InventarioAutos inventario = new InventarioAutos();


        inventario.agregarAuto(new Auto("Toyota", "Corolla", 2022, 25000));
        inventario.agregarAuto(new Auto("Honda", "Civic", 2023, 27000));
        inventario.agregarAuto(new Auto("Ford", "Mustang", 2021, 40000));


        List<Auto> toyotas = inventario.buscarPorMarca("Toyota");
        System.out.println("Autos Toyota encontrados:");
        for (Auto auto : toyotas) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }


        List<Auto> autos2022 = inventario.buscarPorAño(2022);
        System.out.println("\nAutos del año 2022 encontrados:");
        for (Auto auto : autos2022) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }


        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
}
