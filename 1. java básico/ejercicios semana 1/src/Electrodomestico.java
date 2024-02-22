public class Electrodomestico {
    private  int codgo;

    private  String marca;

    private  String modelo;

    private  int consumo;

    private  String color;

    public Electrodomestico(int codgo, String marca, String modelo, int consumo, String color) {
        this.codgo = codgo;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public Electrodomestico() {

    }


    public int getCodgo() {
        return codgo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }

    public void setCodgo(int codgo) {
        this.codgo = codgo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
