
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return LocalDateTime.parse(stringDate, formatter);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.forLanguageTag("fr"));

        return LocalDate.parse(stringDate, formatter);
    }


    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) {
            return null;
        }
        String[] parts = stringDate.split(" ");
        int hours = Integer.parseInt(parts[0]);
        if (!stringDate.contains("heures du matin")) {
            hours += 12;
        }
        int minutes = Integer.parseInt(parts[4]);
        int seconds = Integer.parseInt(parts[7]);
        return LocalTime.of(hours, minutes, seconds);
    }

}
    