package Task;

public class DebugHandler extends AbstractHandler {
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (this.nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }
}
