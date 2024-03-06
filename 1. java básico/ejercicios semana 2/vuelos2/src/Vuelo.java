class Vuelo {
    private String destino;
    private int asientosDisponibles;

    public Vuelo(String destino, int capacidad) {
        this.destino = destino;
        this.asientosDisponibles = capacidad;
    }

    public Vuelo() {
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}