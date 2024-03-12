import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Agenda {
    private List<Evento> eventos;

    public Agenda(List<Evento> eventos) {
        this.eventos = eventos;
    }

    // Filtra los eventos que están programados para una fecha específica.
    public List<Evento> eventosEnFecha(LocalDate fecha) {
        return eventos.stream()
                .filter(evento -> evento.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }

    // Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
    public Map<String, Long> contarEventosPorCategoria() {
        return eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
    }

    // Encuentra el evento más próximo en el tiempo utilizando Optionals.
    public Optional<Evento> eventoMasProximo(LocalDate fechaActual) {
        return eventos.stream()
                .filter(evento -> evento.getFecha().isAfter(fechaActual))
                .min(Comparator.comparing(Evento::getFecha));
    }
}



