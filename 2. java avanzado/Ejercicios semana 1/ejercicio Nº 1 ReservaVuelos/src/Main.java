public class Main {
    public static void main(String[] args) {
        try {

            reservarVuelo("Juan Pérez", "Miami", "2024-03-10", 2);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al reservar vuelo: " + e.getMessage());
        }
    }

    public static void reservarVuelo(String nombre, String destino, String fecha, int numAsientos) throws ReservaInvalidaException {
        // Validar datos de entrada
        if (nombre == null || nombre.isEmpty() || destino == null || destino.isEmpty() || fecha == null || fecha.isEmpty() || numAsientos <= 0) {
            throw new ReservaInvalidaException("Falta información esencial para la reserva.");
        }


        int asientosDisponibles = 5;
        if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        }


        System.out.println("Reserva realizada para " + nombre + " con destino a " + destino + " para el " + fecha + " con " + numAsientos + " asiento(s) reservados.");
    }
}

