import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
public class Main {
    public static void main(String[] args) {

        BlockingQueue<Llamada> colaLlamadas = new ArrayBlockingQueue<>(10);
        AgenteSoporte agente1 = new AgenteSoporte("Agente 1", colaLlamadas);
        AgenteSoporte agente2 = new AgenteSoporte("Agente 2", colaLlamadas);

        agente1.start();
        agente2.start();

        // Simulación de llegada de llamadas
        for (int i = 0; i < 20; i++) {
            Cliente cliente = new Cliente("Cliente " + (i + 1));
            Llamada llamada = new Llamada(cliente, "Consulta " + (i + 1));
            try {
                colaLlamadas.put(llamada);
                System.out.println("Llamada de " + cliente.getNombre() + " en espera...");
                Thread.sleep(1000); // Simular intervalo entre llamadas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}




