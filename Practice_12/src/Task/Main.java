package Task;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new TestTask("Theme", "Dark"));
        Thread thread2 = new Thread(new TestTask("Language", "Russian"));
        Thread thread3 = new Thread(new TestTask("Path", "/usr/home"));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        AppSettings settings = AppSettings.getInstance();
        System.out.println(settings.getSetting("Theme"));
        System.out.println(settings.getSetting("Language"));
        System.out.println(settings.getSetting("Path"));
    }
}
