import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class zad5 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.getTime());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Poland"));
        System.out.println(now);
    }
}
