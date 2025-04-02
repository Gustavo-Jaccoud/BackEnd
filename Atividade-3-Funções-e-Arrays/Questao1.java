import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Questao1 {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd / MM / yyyy  HH : mm");

        String formattedDate = data.format(formatter);
        
        System.out.println(formattedDate);
    }
}
