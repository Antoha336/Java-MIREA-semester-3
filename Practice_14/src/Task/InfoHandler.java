package Task;

public class InfoHandler extends AbstractHandler {
    public void handle(LogLevel level, String message) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (this.nextHandler != null) {
            nextHandler.handle(level, message);
        }
    }
}
