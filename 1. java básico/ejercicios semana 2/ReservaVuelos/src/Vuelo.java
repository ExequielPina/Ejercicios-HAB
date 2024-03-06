class Vuelo {
    private String destino;
    private int asientosDisponibles;

    public Vuelo(String destino, int capacidad) {
        this.destino = destino;
        this.asientosDisponibles = capacidad;
    }

    public boolean reservarAsientos(int cantidad) throws ReservaInvalidaException {
        if (cantidad <= 0) {
            throw new ReservaInvalidaException("La cantidad de asientos a reservar debe ser mayor que cero.");
        }
        if (cantidad > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles para la reserva.");
        }

        asientosDisponibles -= cantidad;
        System.out.println("Reserva exitosa para " + cantidad + " asientos hacia " + destino);
        return true;
    }
}
