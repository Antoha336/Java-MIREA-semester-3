package Task;

public class CriticalHandler extends AbstractHandler {
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.CRITICAL) {
            System.out.println("CRITICAL: " + message);
        } else if (this.nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }
}
