import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }
    public void agregarProducto(String nombre, double precio, int cantidad) throws IllegalArgumentException {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio del producto debe ser mayor que cero.");
        }
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad disponible del producto no puede ser negativa.");
        }


    }

}