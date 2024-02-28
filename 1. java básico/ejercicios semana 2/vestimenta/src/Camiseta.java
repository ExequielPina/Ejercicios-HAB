public class Camiseta extends Vestimenta {

    private String manga;
    private String cuello;





    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color); // Llama al constructor con parámetros de la clase padre
        this.manga = manga;
        this.cuello = cuello;
    }


    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public void mostrarManga() {
        System.out.println("Esta camiseta es de manga: " + getManga());
    }
}
