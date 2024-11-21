package Task;

public class TestTask implements Runnable {
    private final String key;
    private final String value;

    public TestTask(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public void run() {
        AppSettings settings = AppSettings.getInstance();
        settings.setSetting(this.key, this.value);
        System.out.println(Thread.currentThread().getName() + " -> " + key + ": " + settings.getSetting(key));
    }
}
