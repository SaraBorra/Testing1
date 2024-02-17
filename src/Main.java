import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String x = formatDate(dateTime);
        System.out.println(x);
    }
    public static String formatDate(OffsetDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
        String formattedDate = dateTime.format(formatter);

        return formattedDate;
    }
}
