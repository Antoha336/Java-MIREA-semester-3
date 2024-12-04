package Task;

public class WarningHandler extends AbstractHandler {
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.WARNING) {
            System.out.println("WARNING: " + message);
        } else if (this.nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }
}
