public class Main {
    public static void main(String[] args) {
        Tarea proyecto = new Tarea("Desarrollo de Software");

        Tarea tareaDiseño = new Tarea("Diseño de la Aplicación");
        tareaDiseño.agregarSubtarea(new Tarea("Crear Prototipo"));
        Tarea diseñoInterfaz = new Tarea("Diseñar Interfaz");
        diseñoInterfaz.agregarSubtarea(new Tarea("Definir Esquema de Colores"));
        diseñoInterfaz.agregarSubtarea(new Tarea("Diseñar Diseño Responsivo"));
        tareaDiseño.agregarSubtarea(diseñoInterfaz);
        tareaDiseño.agregarSubtarea(new Tarea("Documentar Requisitos"));
        proyecto.agregarSubtarea(tareaDiseño);

        Tarea tareaImplementacion = new Tarea("Implementación del Código");
        Tarea desarrollarBackend = new Tarea("Desarrollar Backend");
        desarrollarBackend.agregarSubtarea(new Tarea("Configurar Base de Datos"));
        desarrollarBackend.agregarSubtarea(new Tarea("Crear Lógica de Negocios"));
        tareaImplementacion.agregarSubtarea(desarrollarBackend);
        Tarea desarrollarFrontend = new Tarea("Desarrollar Frontend");
        desarrollarFrontend.agregarSubtarea(new Tarea("Codificar Interfaz de Usuario"));
        desarrollarFrontend.agregarSubtarea(new Tarea("Integrar con Backend"));
        tareaImplementacion.agregarSubtarea(desarrollarFrontend);
        proyecto.agregarSubtarea(tareaImplementacion);

        Tarea tareaPruebas = new Tarea("Pruebas y Depuración");
        tareaPruebas.agregarSubtarea(new Tarea("Ejecutar Pruebas de Integración"));
        tareaPruebas.agregarSubtarea(new Tarea("Solucionar Errores"));
        proyecto.agregarSubtarea(tareaPruebas);

        proyecto.imprimir(0);
    }
}
