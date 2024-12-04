package Task;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        load(filename);
    }

    private void load(String filename) {
        System.out.println("Loaded: " + filename);
    }

    public void display() {
        System.out.println("Displayed: " + this.filename);
    }
}
