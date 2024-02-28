public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }


    @Override
    public int calcularAntiguedad() {

        int añoActual = java.time.Year.now().getValue();
        return añoActual - this.getAño();
    }


    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía eléctrica...");
    }


    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
}
