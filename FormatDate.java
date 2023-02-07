import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        return "Le " + dateTime.format(DateTimeFormatter.ofPattern("dd MMM. de l'an yyyy à HH'h'mm'm et ss's'")) ;
    }
    
    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd HH");
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        return time.format(DateTimeFormatter.ISO_LOCAL_TIME);

    }

}