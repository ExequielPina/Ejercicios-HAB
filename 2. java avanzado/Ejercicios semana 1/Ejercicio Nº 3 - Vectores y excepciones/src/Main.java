public class Main {
    public static void main(String[] args) {


        Inventario inventario = new Inventario();

        try {

            inventario.agregarProducto("", 10.0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }

    }
}