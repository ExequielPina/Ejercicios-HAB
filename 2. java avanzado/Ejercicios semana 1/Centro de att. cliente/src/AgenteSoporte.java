import java.util.concurrent.BlockingQueue;
class AgenteSoporte extends Thread {
    private String nombre;
    private BlockingQueue<Llamada> colaLlamadas;

    public AgenteSoporte(String nombre, BlockingQueue<Llamada> colaLlamadas) {
        this.nombre = nombre;
        this.colaLlamadas = colaLlamadas;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Llamada llamada = colaLlamadas.take();
                System.out.println(nombre + " atendiendo llamada de " + llamada.getCliente().getNombre() +
                        " - Consulta: " + llamada.getConsulta());
                // Simular resolución de la consulta
                Thread.sleep(2000);
                System.out.println(nombre + " resolvió la consulta de " + llamada.getCliente().getNombre());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}