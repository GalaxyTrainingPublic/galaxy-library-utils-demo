package pe.edu.galaxy.training.java.library.utils.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utilitarios para formatear y parsear fechas.
 */
public final class DateFormatUtils {

    private static final String DEFAULT_DATE_PATTERN=DatePatterns.DD_MM_YYYY;
    private static final String DEFAULT_DATETIEM_PATTERN=DatePatterns.DD_MM_YYYY_HH_MM_SS;

    private DateFormatUtils() {}

    /**
     * Formatea un LocalDate con el patrón indicado.
     */
    public static String format(LocalDate date) {
        if (date == null) throw new DateFormatException("la fecha no puede ser nulo");
        return date.format(DateTimeFormatter.ofPattern(DEFAULT_DATE_PATTERN));
    }

    /**
     * Formatea un LocalDate con el patrón indicado.
     */
    public static String format(LocalDate date, String pattern) {
        if (date == null) throw new DateFormatException("la fecha no puede ser nulo");
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }


    /**
     * Formatea un LocalDateTime con el patrón indicado.
     */
    public static String format(LocalDateTime dateTime) {
        if (dateTime == null) throw new DateFormatException("la fecha y hora no puede ser nulo");;
        return dateTime.format(DateTimeFormatter.ofPattern(DEFAULT_DATETIEM_PATTERN));
    }

    /**
     * Formatea un LocalDateTime con el patrón indicado.
     */
    public static String format(LocalDateTime dateTime, String pattern) {
        if (dateTime == null) throw new DateFormatException("la fecha y hora no puede ser nulo");;
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }
}
