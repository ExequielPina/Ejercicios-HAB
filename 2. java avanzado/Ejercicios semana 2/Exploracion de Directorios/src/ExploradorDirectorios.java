public class ExploradorDirectorios {

    public static void explorarDirectorio(Directorio directorio, String indentacion) {
        System.out.println(indentacion + directorio.getNombre() + "/");
        for (String archivo : directorio.getListaArchivos()) {
            System.out.println(indentacion + "  " + archivo);
        }
        for (Directorio subdirectorio : directorio.getListaSubdirectorios()) {
            explorarDirectorio(subdirectorio, indentacion + "  ");
        }
    }



}