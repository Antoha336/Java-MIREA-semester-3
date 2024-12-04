package Task;

interface Handler {
    void handle(LogLevel level, String message);
    void setNextHandler(Handler nextHandler);
}
