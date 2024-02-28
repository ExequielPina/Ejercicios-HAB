public class Main {
    public static void main(String[] args) {

        Vestimenta[] vestimentas = new Vestimenta[9]; // Tamaño 9 para almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero


        vestimentas[0] = new Zapato(101, "Zapato Casual", 59.99, "Marca Polo", "42", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(102, "Zapato Deportivo", 49.99, "Marca Nike", "41", "Blanco", "Sintético", "Velcro");
        vestimentas[2] = new Zapato(103, "Zapato Formal", 79.99, "Marca Adidas", "43", "Marrón", "Piel", "Hebilla");

        // Almacenar 3 pantalones
        vestimentas[3] = new Pantalon(201, "Pantalón Vaquero", 39.99, "Marca Oneil", "M", "Azul", "Slim Fit", "Denim");
        vestimentas[4] = new Pantalon(202, "Pantalón Deportivo", 29.99, "Marca New balance", "L", "Negro", "Regular Fit", "Algodón");
        vestimentas[5] = new Pantalon(203, "Pantalón Formal", 49.99, "Marca Zara", "XL", "Gris", "Straight Fit", "Lana");


        vestimentas[6] = new Camiseta(301, "Camiseta Manga Corta", 19.99, "Marca Nike", "S", "Blanco", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(302, "Camiseta Manga Larga", 24.99, "Marca Adidas", "M", "Negro", "Larga", "V");


        vestimentas[8] = new Sombrero(401, "Sombrero de Verano", 29.99, "Marca Under", "Única", "Azul", "Panamá", "Mediano");


        for (Vestimenta v : vestimentas) {
            if (v instanceof Zapato) {
                ((Zapato) v).mostrarMarca();
            } else if (v instanceof Pantalon) {
                ((Pantalon) v).mostrarEstilo();
            } else if (v instanceof Camiseta) {
                ((Camiseta) v).mostrarManga();
            } else if (v instanceof Sombrero) {
                ((Sombrero) v).mostrarTipo();
            }
        }
    }
}




