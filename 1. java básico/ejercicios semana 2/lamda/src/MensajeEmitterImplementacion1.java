class MensajeEmitterImplementacion1 implements MensajeEmitter {
    @Override
    public String emitirMensaje(String mensaje) {
        return "Recibí el siguiente parámetro: " + mensaje;
    }

}
