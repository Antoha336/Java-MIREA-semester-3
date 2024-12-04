package Task;

abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(LogLevel level, String message);
}
