import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void formatDate() {
        Main main = new Main();
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String result = main.formatDate(dateTime);
        assertEquals(result,"01 marzo 2023" );

    }
}