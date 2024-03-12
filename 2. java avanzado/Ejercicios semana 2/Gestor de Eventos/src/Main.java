import java.time.LocalDate;
import java.util.*;



public class Main {
    public static void main(String[] args)
    {
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión", LocalDate.of(2024, 3, 10), "Trabajo"),
                new Evento("Conferencia", LocalDate.of(2024, 3, 12), "Educación"),
                new Evento("Taller", LocalDate.of(2024, 3, 14), "Desarrollo"));

        Agenda agenda = new Agenda(eventos);

        // Filtrar eventos para una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2024, 3, 12);
        List<Evento> eventosEnFecha = agenda.eventosEnFecha(fechaEspecifica);
        System.out.println("Eventos en la fecha " + fechaEspecifica + ": " + eventosEnFecha);

        // Contar eventos por categoría
        Map<String, Long> eventosPorCategoria = agenda.contarEventosPorCategoria();
        System.out.println("Eventos por categoría: " + eventosPorCategoria);

        // Encontrar el evento más próximo
        LocalDate fechaActual = LocalDate.of(2024, 3, 11);
        Optional<Evento> eventoProximo = agenda.eventoMasProximo(fechaActual);
        eventoProximo.ifPresentOrElse(
                evento -> System.out.println("El evento más próximo es: " + evento.getNombre()),
                () -> System.out.println("No hay eventos futuros"));
    }
    }
