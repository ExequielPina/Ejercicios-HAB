public class Main {
    public static void main(String[] args) {
        Directorio raiz = new Directorio(1, "Raiz");
        Directorio carpeta1 = new Directorio(2, "Carpeta1");
        Directorio carpeta2 = new Directorio(3, "Carpeta2");

        raiz.agregarSubdirectorio(carpeta1);
        raiz.agregarSubdirectorio(carpeta2);

        carpeta1.agregarArchivo("Archivo1.txt");
        carpeta1.agregarArchivo("Archivo2.txt");

        Directorio subcarpeta = new Directorio(4, "Subcarpeta");
        carpeta2.agregarSubdirectorio(subcarpeta);
        subcarpeta.agregarArchivo("Archivo3.txt");

        ExploradorDirectorios.explorarDirectorio(raiz, "");


    }
}