public class Hilo extends  Thread{
    private int catidad =9;
    private String nombre;

    public Hilo(int catidad, String nombre) {
        this.catidad = catidad;
        this.nombre = nombre;
    }

    // Sobrescribir el método run() para definir la tarea del hilo
    @Override
    public void run() {
        for (int i = 1; i <= catidad; i++) {
            System.out.println(nombre + ": Contador " + i);

            try {
                // Introducir una pequeña pausa para simular un trabajo
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}



