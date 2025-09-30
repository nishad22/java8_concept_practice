package timeapi.practiceProblem;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

//You're building a global meeting scheduling application.
// A user in New York schedules a meeting for 2:00 PM EST on March 15th, 2025.
// How would you store this in the database and display it correctly for users in London and Tokyo?
// Show me the code and explain your approach.
public class PracticeProblem1 {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        //converting to localeDateTime to ZonedDateTime
        LocalDateTime tokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Local time of Tokyo: "+tokyo);

        LocalDateTime london = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Local time of London: "+london);

    }
}
