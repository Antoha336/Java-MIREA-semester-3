package Task;

public class ErrorHandler extends AbstractHandler {
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (this.nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }
}
