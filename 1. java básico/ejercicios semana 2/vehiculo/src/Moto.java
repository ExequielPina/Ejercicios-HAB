public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int año, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, año, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }


    @Override
    public int calcularAntiguedad() {
        // Se asume que el año de fabricación es relativo al año actual
        int añoActual = java.time.Year.now().getValue();
        return añoActual - this.getAño();
    }


    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la moto...");
    }

    // Getters y Setters específicos para los atributos de Moto
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
