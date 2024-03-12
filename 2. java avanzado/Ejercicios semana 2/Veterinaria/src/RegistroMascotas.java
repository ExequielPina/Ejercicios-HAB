import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class RegistroMascotas {
    private List<Mascota<?>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }


    public void agregarMascota(Mascota<?> mascota) {
        registro.add(mascota);
    }


    public List<Mascota<?>> buscarPorNombre(String nombre) {
        List<Mascota<?>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }


    public List<Mascota<?>> buscarPorEspecie(Object especie) {
        List<Mascota<?>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<?> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }


    public int cantidadTotalMascotas() {
        return registro.size();
    }


    public static Mascota<?> generarDatosAleatorios() {
        Random random = new Random();
        int tipoMascota = random.nextInt(4);
        String nombre = generarNombreAleatorio();
        int edad = random.nextInt(15) + 1;

        switch (tipoMascota) {
            case 0:
                return new Mascota<>(nombre, edad, "Perro");
            case 1:
                return new Mascota<>(nombre, edad, "Gato");
            case 2:
                return new Mascota<>(nombre, edad, "Reptil");
            default:
                return new Mascota<>(nombre, edad, "Ave");
        }
    }

    
    private static String generarNombreAleatorio() {
        String[] nombres = {"Luna", "Buddy", "Max", "Daisy", "Rocky", "Bella", "Charlie", "Lucy", "Bailey", "Molly"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }
}
