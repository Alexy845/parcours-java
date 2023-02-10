import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        String dT = dateTime.format(DateTimeFormatter.ofPattern("'Le' dd MMM 'de l'\'an' yyyy 'à' HH'h'mm'm' 'et' ss's'", Locale.forLanguageTag("fr")));
        return dT;
    }

    public static String formatSimple(LocalDate date) {
        if (date == null) {
            return null;
        }
        String d = date.format(DateTimeFormatter.ofPattern("MMMM dd yy", Locale.forLanguageTag("it")));
        return d;
    }
    public static String formatIso(LocalTime time) {
        if (time == null) {
            return null;
        }
        if (time.getNano() == 0) {
            String t = time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            return t;
        }
        String t = time.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS"));
        return t;
    }

}