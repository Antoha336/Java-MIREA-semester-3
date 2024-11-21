package Task;

import java.util.concurrent.ConcurrentHashMap;

public class AppSettings {
    private static AppSettings instance;
    private final ConcurrentHashMap<String, String> settings = new ConcurrentHashMap<>();

    private AppSettings() {}

    public static synchronized AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public void setSetting(String key, String value) {
        this.settings.put(key, value);
    }
    public String getSetting(String key) {
        return this.settings.get(key);
    }
}
