import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public void imprimir(int nivel) {
        String tabs = "\t".repeat(nivel);
        System.out.println(tabs + "|-- Tarea: " + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.imprimir(nivel + 1);
        }
    }
}
