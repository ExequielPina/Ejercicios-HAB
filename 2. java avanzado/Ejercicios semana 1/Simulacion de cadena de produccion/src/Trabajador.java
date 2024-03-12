
import java.util.concurrent.BlockingQueue;

class Trabajador extends Thread {
    private final String nombre;
    private final BlockingQueue<String> colaTareas;

    public Trabajador(String nombre, BlockingQueue<String> colaTareas) {
        this.nombre = nombre;
        this.colaTareas = colaTareas;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String tarea = colaTareas.take();
                System.out.println(nombre + " está realizando la tarea: " + tarea);
                Thread.sleep(2000); // Simula el tiempo que lleva completar la tarea
                System.out.println(nombre + " ha completado la tarea: " + tarea);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

