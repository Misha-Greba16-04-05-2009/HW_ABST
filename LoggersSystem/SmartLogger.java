package LoggersSystem;
import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int callCount = 0;

    @Override
    public void log(String msg) {
        callCount++;
        LocalDateTime now = LocalDateTime.now();

        String type = "INFO";
        if (msg.toLowerCase().contains("error")) {
            type = "ERROR";
        }

        System.out.println(type + "#" + callCount + " [" + now + "] " + msg);
    }
}