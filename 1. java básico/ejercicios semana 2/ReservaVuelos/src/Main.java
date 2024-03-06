public class Main {
    public static void main(String[] args) throws ReservaInvalidaException {
        // Ejemplo de uso
        Vuelo vuelo = new Vuelo("Nueva York", 100);

        vuelo.reservarAsientos(3);
        vuelo.reservarAsientos(2);
        vuelo.reservarAsientos(150); // Esto debería lanzar una excepción por cantidad excesiva
    }
}