import java.util.ArrayList;
import java.util.List;

class InventarioAutos {
    private List<Auto> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        inventario.add(auto);
    }

    public List<Auto> buscarPorMarca(String marca) {
        List<Auto> resultado = new ArrayList<>();
        for (Auto auto : inventario) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    public List<Auto> buscarPorAño(int año) {
        List<Auto> resultado = new ArrayList<>();
        for (Auto auto : inventario) {
            if (auto.getAño() == año) {
                resultado.add(auto);
            }
        }
        return resultado;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Auto auto : inventario) {
            total += auto.getPrecio();
        }
        return total;
    }
}