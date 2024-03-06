import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> meses = new ArrayList<>();


        AgregarMes agregarMes = (lista, mes) -> lista.add(mes);


        agregarMes.agregar(meses, "Enero");
        agregarMes.agregar(meses, "Febrero");
        agregarMes.agregar(meses, "Marzo");
        agregarMes.agregar(meses, "Abril");
        agregarMes.agregar(meses, "Mayo");
        agregarMes.agregar(meses, "Junio");


        agregarMes.agregar(meses, "Diciembre");
        meses.forEach(p -> System.out.println("el meses es :" + p));
    }
}

interface AgregarMes {
    void agregar(List<String> lista, String mes);
}
