import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args)
    {
        BlockingQueue<String> colaTareas = new ArrayBlockingQueue<>(10);

        // Creamos los trabajadores (hilos)
        Trabajador trabajador1 = new Trabajador("Trabajador 1", colaTareas);
        Trabajador trabajador2 = new Trabajador("Trabajador 2", colaTareas);
        Trabajador trabajador3 = new Trabajador("Trabajador 3", colaTareas);

        // Iniciamos los trabajadores
        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        // Simulamos la llegada de tareas a la cola
        try {
            colaTareas.put("Ensamblar producto A");
            colaTareas.put("Realizar control de calidad del producto A");
            colaTareas.put("Embalar producto A");
            colaTareas.put("Ensamblar producto B");
            colaTareas.put("Realizar control de calidad del producto B");
            colaTareas.put("Embalar producto B");
            // Podríamos seguir añadiendo más tareas
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}