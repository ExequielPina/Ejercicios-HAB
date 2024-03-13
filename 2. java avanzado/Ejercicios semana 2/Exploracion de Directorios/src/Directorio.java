import java.util.ArrayList;
import java.util.List;

class Directorio {
    private int id;
    private String nombre;
    private List<Directorio> listaSubdirectorios;
    private List<String> listaArchivos;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaSubdirectorios = new ArrayList<>();
        this.listaArchivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        listaSubdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        listaArchivos.add(archivo);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getListaSubdirectorios() {
        return listaSubdirectorios;
    }

    public List<String> getListaArchivos() {
        return listaArchivos;
    }
}