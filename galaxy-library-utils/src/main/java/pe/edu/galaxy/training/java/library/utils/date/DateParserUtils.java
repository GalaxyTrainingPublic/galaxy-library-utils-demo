package pe.edu.galaxy.training.java.library.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilitarios para convertir String → Fecha.
 */
public final class DateParserUtils {

    private DateParserUtils() {}

    /**
     * Convierte un String a LocalDate con el patrón indicado.
     */
    public static LocalDate parseToLocalDate(String text, String pattern) {
        if (text == null || text.isBlank()) return null;
        return LocalDate.parse(text, DateTimeFormatter.ofPattern(pattern));
    }

    /**
     * Convierte un String a LocalDateTime con el patrón indicado.
     */
    public static LocalDateTime parseToLocalDateTime(String text, String pattern) {
        if (text == null || text.isBlank()) return null;
        return LocalDateTime.parse(text, DateTimeFormatter.ofPattern(pattern));
    }
}
