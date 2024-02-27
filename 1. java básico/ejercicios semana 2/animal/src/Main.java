public class Main {
    public static void main(String[] args) {

        Mamifero miPerro = new Mamifero(1, "Fido", 3, "Pelo", "Carnívoro", 4, "Vivíparo", "Marrón", "Doméstico");
        Ave miAguila = new Ave(2, "Aquila", 5, "Plumas", "Carnívoro", 2.5, "Planeador", "Marrón oscuro", "Curvo");
        Reptil miReptil = new Reptil(3, "Rex", 2, "Escamas", "Carnívoro", 1.2, "Espinosa", "Veneno neurotóxico", "Selva");


            miPerro.saludar();



            miAguila.saludar();



            miReptil.saludar();
        }

    }





//  En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
// Respuesta:  no es posible ya que no se sabe si es un mamífero ave o reptil, por lo que al ejecutar el código lanzara una excepción



//Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
// Respuesta: No es posible acceder desde el Main a un método private.