public class Main {
    public static void main(String[] args) {
        // Crear un vector para almacenar 5 verduras
        Verdura[] verduras = new Verdura[5];


        verduras[0] = new Verdura(1, "Lechuga", "Verde", 10, false);
        verduras[1] = new Verdura(2, "Tomate", "Rojo", 20, false);
        verduras[2] = new Verdura(3, "Zanahoria", "Naranja", 30, true);
        verduras[3] = new Verdura(4, "Brócoli", "Verde", 25, true);
        verduras[4] = new Verdura(5, "Pimiento", "Rojo", 15, false);


        for (Verdura verdura : verduras) {
            System.out.println("ID: " + verdura.getId());
            System.out.println("Nombre: " + verdura.getNombre());
            System.out.println("Color: " + verdura.getColor());
            System.out.println("Calorías: " + verdura.getCalorias());
            System.out.println("¿Debe cocinarse? " + (verdura.isDebeCocinarse() ? "Sí" : "No"));

        }

        for (Verdura verdura : verduras) {
            System.out.println("Nombre: " + verdura.getNombre());
            System.out.println("Calorías: " + verdura.getCalorias());

        }

        // Cambiar los datos de dos verduras (por ejemplo, la primera y la última)
        verduras[0].setNombre("Espinaca");
        verduras[0].setColor("Verde oscuro");
        verduras[0].setCalorias(12);
        verduras[0].setDebeCocinarse(true);

        verduras[4].setNombre("Cebolla");
        verduras[4].setColor("Blanco");
        verduras[4].setCalorias(18);
        verduras[4].setDebeCocinarse(true);

        // Mostrar por pantalla los datos de todas las verduras después del cambio
        System.out.println("Datos actualizados de todas las verduras:");
        for (Verdura verdura : verduras) {
            System.out.println("Nombre: " + verdura.getNombre());
            System.out.println("Color: " + verdura.getColor());
            System.out.println("Calorías: " + verdura.getCalorias());
            System.out.println("¿Debe cocinarse? " + (verdura.isDebeCocinarse() ? "Sí" : "No"));

        }


        System.out.println("Verduras de color verde:");
        for (Verdura verdura : verduras) {
            if (verdura.getColor().equalsIgnoreCase("verde")) {
                System.out.println("Nombre: " + verdura.getNombre());
                System.out.println("Color: " + verdura.getColor());
                System.out.println("Calorías: " + verdura.getCalorias());
                System.out.println("¿Debe cocinarse? " + (verdura.isDebeCocinarse() ? "Sí" : "No"));

            }
        }

    }

}
