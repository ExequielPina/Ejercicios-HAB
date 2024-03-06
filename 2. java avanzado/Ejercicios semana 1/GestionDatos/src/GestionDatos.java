import java.util.Arrays;

public class GestionDatos {
    private static final int TAMANIO_VECTOR = 5;
    private static int[] vector = new int[TAMANIO_VECTOR];

    public static void almacenarDato(int indice, int dato) {
        try {
            if (indice < 0 || indice >= TAMANIO_VECTOR) {
                throw new IndexOutOfBoundsException("Índice fuera del rango del vector");
            }
            vector[indice] = dato;
            System.out.println("Dato almacenado correctamente en el índice " + indice);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void accederDato(int indice) {
        try {
            if (indice < 0 || indice >= TAMANIO_VECTOR) {
                throw new IndexOutOfBoundsException("Índice fuera del rango del vector");
            }
            int dato = vector[indice];
            System.out.println("Dato en el índice " + indice + ": " + dato);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
