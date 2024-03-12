import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        RegistroMascotas registro = new RegistroMascotas();

        // Agregar mascotas al registro
        for (int i = 0; i < 10; i++) {
            registro.agregarMascota(RegistroMascotas.generarDatosAleatorios());
        }

        // Buscar mascotas por nombre
        List<Mascota<?>> mascotasConNombreLuna = registro.buscarPorNombre("Luna");
        System.out.println("Mascotas con nombre Luna:");
        for (Mascota<?> mascota : mascotasConNombreLuna) {
            System.out.println(mascota);
        }

        // Buscar mascotas por especie
        List<Mascota<?>> perrosRegistrados = registro.buscarPorEspecie("Perro");
        System.out.println("\nPerros registrados:");
        for (Mascota<?> mascota : perrosRegistrados) {
            System.out.println(mascota);
        }

        // Contar la cantidad total de mascotas registradas
        System.out.println("\nCantidad total de mascotas registradas: " + registro.cantidadTotalMascotas());
    }
}


