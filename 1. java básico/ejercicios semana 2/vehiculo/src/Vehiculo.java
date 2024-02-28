public abstract class Vehiculo {
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costo;

    public Vehiculo(int id, String placa, String marca, String modelo, int año, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costo = costo;
    }


    public abstract int calcularAntiguedad();

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Interfaz Electrico
    interface Electrico {
        void cargarEnergia();
    }

    // Interfaz Combustion
    interface Combustion {
        void recargarCombustible();
    }

}
