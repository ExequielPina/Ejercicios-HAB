public class Main {
    public static void main(String[] args) {
        // 1. Usando una clase regular
        MensajeEmitterImplementacion1 emisor1 = new MensajeEmitterImplementacion1();
        System.out.println(emisor1.emitirMensaje("Mensaje 1"));

        // 2. Usando una clase anónima
        MensajeEmitter emisor2 = new MensajeEmitter() {
            @Override
            public String emitirMensaje(String mensaje) {
                return "Recibí el siguiente parámetro: " + mensaje;
            }
        };
        System.out.println(emisor2.emitirMensaje("Mensaje 2"));

        // 3. Usando una expresión lambda compleja
        MensajeEmitter emisor3 = (String mensaje) -> {
            return "Recibí el siguiente parámetro: " + mensaje;
        };
        System.out.println(emisor3.emitirMensaje("LAMBDA COMPLEJA" ));

        // 4. Usando una expresión lambda simple
        MensajeEmitter emisor4 = mensaje -> "Recibí el siguiente parámetro: " + mensaje;
        System.out.println(emisor4.emitirMensaje("LAMBDA SIMPLE"));
    }
}

