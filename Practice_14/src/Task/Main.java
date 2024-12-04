package Task;

public class Main {
    public static void main(String[] args) {
        InfoHandler infoHandler         = new InfoHandler();
        WarningHandler warningHandler   = new WarningHandler();
        ErrorHandler errorHandler       = new ErrorHandler();
        CriticalHandler criticalHandler = new CriticalHandler();
        DebugHandler debugHandler       = new DebugHandler();

        infoHandler.setNextHandler(warningHandler);
        warningHandler.setNextHandler(errorHandler);
        errorHandler.setNextHandler(criticalHandler);
        criticalHandler.setNextHandler(debugHandler);

        infoHandler.handle(LogLevel.INFO, "info");
        infoHandler.handle(LogLevel.WARNING, "warning");
        infoHandler.handle(LogLevel.ERROR, "error");
        infoHandler.handle(LogLevel.CRITICAL, "critical");
        infoHandler.handle(LogLevel.DEBUG, "debug");
    }
}
