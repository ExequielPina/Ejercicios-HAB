public class Pantalon extends Vestimenta {

    private String estilo;
    private String tipoTejido;


    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color); // Llama al constructor con parámetros de la clase padre
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }


    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    public void mostrarEstilo() {
        System.out.println("Estos pantalones son de estilo: " + getEstilo());
    }
}
