public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }


    @Override
    public int calcularAntiguedad() {
        // Se asume que el año de fabricación es relativo al año actual
        int añoActual = java.time.Year.now().getValue();
        return añoActual - this.getAño();
    }


    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible...");
    }


    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
}
