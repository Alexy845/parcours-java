import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }
    
    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        return time.format(formatter);

    }

}